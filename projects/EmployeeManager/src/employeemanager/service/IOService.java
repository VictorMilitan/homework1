/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.service;

import employeemanager.gui.Main;
import employeemanager.service.EmployeeService;
import employeemanager.newEmployee.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author User
 */
public class IOService extends EmployeeService {

    private static final String EMPLOYEELIST_NODE = "employees";
    private static final String EMPLOYEE_NODE = "employee";
    private static final String NAME_NODE = "name";
    private static final String SURNAME_NODE = "surname";
    private static final String BIRTH_NODE = "birth";
    private static final String ADDRESS_NODE = "address";
    private static final String POSITION_NODE = "position";

    public static void main(String[] args) {

    }

    public static void ExportFileCSV() {
        try {
            serializeToFile(EMPLOYEE_DATA, "C:\\Users\\User\\Desktop\\tewill\\EmployeesHR.txt");
        } catch (IOException ex) {
            Logger.getLogger(EmployeeService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void serializeToFile(ArrayList<Employee> empList, String filePath) throws FileNotFoundException, IOException {
        File outputFile = new File(filePath);
        FileOutputStream fileOutStream = new FileOutputStream(outputFile);
        PrintWriter printWriter = new PrintWriter(fileOutStream);
        for (Employee emp : empList) {
            printWriter.println(emp);
        }
        printWriter.flush();
        fileOutStream.close();
        printWriter.close();
    }

    public static void ImportFileCSV() {
        try {
            deserializeFromFile("C:\\Users\\User\\Desktop\\tewill\\EmployeesHR.txt");
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(EmployeeService.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static void deserializeFromFile(String filePath) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileReader fileReader = new FileReader(new File(filePath));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String fileLine;
        while ((fileLine = bufferedReader.readLine()) != null) {
//            System.out.println(fileLine);
            String[] arrOfStr = fileLine.split(",");
            Employee employee = new Employee(arrOfStr[0], arrOfStr[1], arrOfStr[2], arrOfStr[3], arrOfStr[4], arrOfStr[5]);
            DefaultTableModel employeeListModel = (DefaultTableModel) Main.employeeTable.getModel(); //так ссылаемся на наши данные которые мы указываем в таблице
            int employeeID = employeeListModel.getRowCount() + 1;
            employeeListModel.addRow(new Object[]{arrOfStr[0],arrOfStr[1], arrOfStr[2], arrOfStr[3], arrOfStr[4], arrOfStr[5]});
        }
    }

    public static void ExportFileXML(ArrayList<Employee> empList) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory domBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder domBuilder = domBuilderFactory.newDocumentBuilder();
        Document doc = domBuilder.newDocument();
        Element root = doc.createElement(EMPLOYEELIST_NODE);
        doc.appendChild(root);
        for (Employee emp : empList) {
            Element employee = doc.createElement(EMPLOYEE_NODE);
            root.appendChild(employee);
            Element name = doc.createElement(NAME_NODE);
            name.appendChild(doc.createTextNode(emp.getName()));
            employee.appendChild(name);
            Element surname = doc.createElement(SURNAME_NODE);
            surname.setNodeValue(emp.getSurname());
            surname.appendChild(doc.createTextNode(emp.getSurname()));
            employee.appendChild(surname);
            Element birth = doc.createElement(BIRTH_NODE);
            birth.appendChild(doc.createTextNode(emp.getBirth().toString()));
            employee.appendChild(birth);
            Element address = doc.createElement(ADDRESS_NODE);
            address.appendChild(doc.createTextNode(emp.getStreet() + " " + emp.getCity() + " " + emp.getCountry() + " " +emp.getZip()));
            employee.appendChild(address);
            Element position = doc.createElement(POSITION_NODE);
            position.appendChild(doc.createTextNode(emp.getPosition().toString()));
            employee.appendChild(position);
        }
        doc.getDocumentElement().normalize();

        // Writing to a file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult destination = new StreamResult(new File("C:\\Users\\User\\Desktop\\tewill\\EmployeesHR.xml"));
        transformer.transform(source, destination);

    }

    public static void ImportFileXML() throws SAXException, IOException, ParserConfigurationException {

        File inputFile = new File("C:\\Users\\User\\Desktop\\tewill\\EmployeesHR.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document xmlDoc = dBuilder.parse(inputFile);
        xmlDoc.getDocumentElement().normalize();

        System.out.println("Root element :" + xmlDoc.getDocumentElement().getNodeName());
        NodeList nList = xmlDoc.getElementsByTagName(EMPLOYEE_NODE);

        for (int index = 0; index < nList.getLength(); index++) {
            Node nNode = nList.item(index);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String newName = eElement.getElementsByTagName(NAME_NODE).item(0).getTextContent();
                String newSurname = eElement.getElementsByTagName(SURNAME_NODE).item(0).getTextContent();
                String newBirth = eElement.getElementsByTagName(BIRTH_NODE).item(0).getTextContent();
                String newAddress = eElement.getElementsByTagName(ADDRESS_NODE).item(0).getTextContent();
                String newPosition = eElement.getElementsByTagName(POSITION_NODE).item(0).getTextContent();

                DefaultTableModel employeeListModel = (DefaultTableModel) Main.employeeTable.getModel(); //так ссылаемся на наши данные которые мы указываем в таблице
                int employeeID = employeeListModel.getRowCount() + 1;
                employeeListModel.addRow(new Object[]{employeeID, newName, newSurname, newBirth, newAddress, newPosition});
            }

        }
    }
}

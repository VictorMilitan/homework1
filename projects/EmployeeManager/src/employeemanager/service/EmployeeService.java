/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.service;

import employeemanager.service.EmployeeDao;
import employeemanager.newEmployee.Employee;
import java.sql.SQLException;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EmployeeService {

    public final static ArrayList<Employee> EMPLOYEE_DATA = new ArrayList<>();

    public static ArrayList<Employee> getEmployeesList() {
        return EMPLOYEE_DATA;
    }

    public static void add(Employee emp) throws SQLException {
//        EmployeeDao empDao = new EmployeeDao();
//        empDao.add(emp);
        getEmployeesList().add(emp);

    }

    public static void add(ArrayList<Employee> empList) throws SQLException {
        EmployeeDao empd = new EmployeeDao();
        empd.add(empList);
    }

    public static Employee getByID(Integer id) {
        for (Employee emp : EMPLOYEE_DATA) {
            if (emp.getId().equals(id)) {
                return emp;
            }

        }
        return null;
    }

    public static void edit(Integer employeeId, String newName, String newSurname, String LocalDate, String newStreet, String newCity, String newCountry, String newZip, String position) {
        int index;
        for (index = 0; index < EMPLOYEE_DATA.size(); index++) {
            if (employeeId.equals(EMPLOYEE_DATA.get(index).getId())) {
                break;
            }
        }
        EMPLOYEE_DATA.get(index).setName(newName);
        EMPLOYEE_DATA.get(index).setSurname(newSurname);
        //EMPLOYEE_DATA.get(index).setBirth
        EMPLOYEE_DATA.get(index).setStreet(newStreet);
        EMPLOYEE_DATA.get(index).setCity(newCity);
        EMPLOYEE_DATA.get(index).setCountry(newCountry);
        EMPLOYEE_DATA.get(index).setZip(Integer.parseInt(newZip));
    }

    public static ArrayList<Employee> printAllEmployees() {
        for (Employee e : EMPLOYEE_DATA) {
            System.out.println(e);
        }
        return EMPLOYEE_DATA;
    }

    public static void delete(Integer employeeId) {
        int index;
        for (index = 0; index < EMPLOYEE_DATA.size(); index++) {
            if (employeeId.equals(EMPLOYEE_DATA.get(index).getId())) {
                break;
            }
        }

        EMPLOYEE_DATA.remove(index);
    }

    public static void EmployeeDao() throws SQLException {
        EmployeeDao empDao = new EmployeeDao();
        ArrayList<Employee> allEmps = empDao.getAll();
        System.out.println(allEmps);
        // Insert
//        Employee ionMocanuEmp = new Employee("Ion", "Mocanu", Position.Programmer);
        // System.out.print(String.format("Adding 1 employee: affected %d", empDao.add(new Employee(/* add here new data */))));

        // Update
        Employee editedEmp = allEmps.get(0);
        editedEmp.setName("new name");
        empDao.edit(editedEmp);

        // Delete
        // System.out.print(String.format("Adding 1 employee: affected %d", empDao.add(new Employee(/* add here new data */))));
        System.out.println(String.format("Removed %s employee: %d rows", editedEmp, empDao.remove(editedEmp)));
    }

    public static ArrayList<Employee> getAll() throws SQLException {
        EmployeeDao empDao = new EmployeeDao();
        return empDao.getAll();
    }
}

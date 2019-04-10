/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.service;

import employeemanager.newEmployee.Employee;
import employeemanager.newEmployee.Position;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EmployeeDao {

    private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/employee";
    private static final String DB_USER = "postgres";
    private static final String DB_PASS = "lol";

    public EmployeeDao() {
    }

    private Connection connect() throws SQLException {
        System.out.println("Connected to postgresql server successfully.");
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    public ArrayList<Employee> getAll() throws SQLException {
        String sql = "SELECT id, name, surname, birth, address, position FROM app.employee";
        try (Connection conn = connect();
                Statement dbStatement = conn.createStatement();
                ResultSet rs = dbStatement.executeQuery(sql)) {
            ArrayList empList = new ArrayList<Employee>();
            while (rs.next()) {
                Employee emp = new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("birth"),
                        rs.getString("address"),
                        Position.getByPositionName(rs.getString("position")));
                empList.add(emp);
            }
            return empList;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to get all the employees");
            throw ex;
        }
    }

    public int add(Employee emp) throws SQLException {
        String insertSql = "INSERT INTO app.employee(name,surname,birth,address,position) VALUES (?,?,?,?,?)";
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(insertSql)) {

            dbStatement.setString(1, emp.getName());
            dbStatement.setString(2, emp.getSurname());
            dbStatement.setString(3, emp.getBirth().toString());
            dbStatement.setString(4, emp.getStreet() + emp.getCity() + emp.getCountry() + emp.getZip());
            dbStatement.setString(5, emp.getPosition().toString());

            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed insert statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employee");
            throw ex;
        }
    }

    public int add(ArrayList<Employee> empList) throws SQLException {
        String insertSql = "INSERT INTO app.employee(name,surname,birth, address, position) VALUES (?,?,?,?,?)";
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(insertSql)) {

            for (Employee emp : empList) {
                dbStatement.setString(1, emp.getName());
                dbStatement.setString(2, emp.getSurname());
                dbStatement.setString(3, emp.getBirth().toString());
                dbStatement.setString(4, emp.getStreet() + emp.getCity() + emp.getCountry() + emp.getZip());
                dbStatement.setString(5, emp.getPosition().toString());
                dbStatement.addBatch();
            }

            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed insert statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employees");
            throw ex;
        }
    }

    public int edit(Employee emp) throws SQLException {
        String updateSql = "UPDATE app.employee SET name=?, surname=?, birth=?, address=?, position=? WHERE id=?";
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(updateSql)) {

            dbStatement.setString(1, emp.getName());
            dbStatement.setString(2, emp.getSurname());
            dbStatement.setString(3, emp.getBirth().toString());
            dbStatement.setString(4, emp.getStreet() + emp.getCity() + emp.getCountry() + emp.getZip());
            dbStatement.setString(5, emp.getPosition().toString());
            dbStatement.setInt(4, emp.getId());

            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed insert statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employees");
            throw ex;
        }
    }

    public int remove(Employee emp) throws SQLException {
        String updateSql = "DELETE FROM app.employee WHERE id=?";
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(updateSql)) {

            dbStatement.setInt(1, emp.getId());
            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed delete statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to delete the employee");
            throw ex;
        }
    }

}

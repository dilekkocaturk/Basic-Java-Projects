import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "DELETE FROM `classicmodels`.`employees` WHERE (`employeeNumber` = ?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 1000);
            int result = statement.executeUpdate();
            System.out.println("Kayıt silindi");

        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM classicmodels.employees");
            ArrayList<Employee> employees = new ArrayList<Employee>();
            while (resultSet.next()) {
                employees.add(new Employee(
                        resultSet.getInt("employeeNumber"),
                        resultSet.getString("lastName"),
                        resultSet.getString("firstName"),
                        resultSet.getString("extension"),
                        resultSet.getString("email"),
                        resultSet.getString("officeCode"),
                        resultSet.getString("jobTitle")));
            }
            System.out.println(employees.size());
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();

            String sql = "INSERT INTO `classicmodels`.`employees` (`employeeNumber`, `lastName`, `firstName`, `extension`, `email`, `officeCode`, `jobTitle`) VALUES (?, ?, ?, ?, ?, ?, ?)";

            statement = connection.prepareStatement(sql);

            statement.setInt(1, 1000);
            statement.setString(2, "Kocatürk");
            statement.setString(3, "Dilek");
            statement.setString(4, "x100");
            statement.setString(5, "example@example.com");
            statement.setString(6, "1");
            statement.setString(7, "X");

            int result = statement.executeUpdate();
            System.out.println("Kayıt eklendi");

        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void updateData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "UPDATE `classicmodels`.`employees` SET `extension` = 'x1000', `email` = 'example1@example.com' WHERE (`employeeNumber` = ?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 1000);
            int result = statement.executeUpdate();
            System.out.println("Kayıt güncellendi");

        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }
    }
}
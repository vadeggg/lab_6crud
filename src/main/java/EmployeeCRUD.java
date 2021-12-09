import java.sql.*;

public class EmployeeCRUD {
    private String user = "postgres";
    private String passwrod = "fizmat";
    private String url = "jdbc:postgresql://localhost:5432/java_labs";


    public void createUser(String name) throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, user, passwrod);
             PreparedStatement statement = connection.prepareStatement("INSERT INTO EMPLOYEE(name)" +
                                                                           " VALUES(?)")) {
            statement.setString(1,name);
            statement.execute();
        }
    }

    public void readUser(int id) throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, user, passwrod);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE id = (?);")) {
             statement.setInt(1,id);
             ResultSet rs = statement.executeQuery();
             if(rs.next()){
                 System.out.println(rs.getString("name"));
             }
        }
    }
    public  void deleteUser(int id)throws SQLException{
        try (Connection connection = DriverManager.getConnection(url, user, passwrod);
             PreparedStatement statement = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE id = (?);")){
            statement.setInt(1,id);
            statement.execute();
        }
    }
    public void updateUserName(String newName, int id) throws SQLException{
        try(Connection connection = DriverManager.getConnection(url, user, passwrod);
            PreparedStatement statement = connection.prepareStatement("UPDATE EMPLOYEE SET name=(?) WHERE id = (?);")){
            {
                statement.setString(1,newName);
                statement.setInt(2,id);
                statement.execute();
            }
        }
    }
}

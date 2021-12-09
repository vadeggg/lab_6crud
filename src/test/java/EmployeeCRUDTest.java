import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeCRUDTest {
//    @Test
//    public void createUserTest() throws SQLException {
//        EmployeeCRUD employee = new EmployeeCRUD();
//        employee.createUser("olkedddsei");
//    }
//    @Test
//    public  void readUserTest() throws SQLException{
//        EmployeeCRUD employee = new EmployeeCRUD();
//        employee.readUser(1);
//    }
    @Test
    public void deleteUserTest() throws SQLException{
        EmployeeCRUD employee = new EmployeeCRUD();
        employee.deleteUser(1);
    }
    @Test
    public void updateUserNameTest() throws SQLException{
        EmployeeCRUD employee = new EmployeeCRUD();
        employee.updateUserName("oleg",18);
    }

}
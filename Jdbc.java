package testconnection;
import java.sql.*;
public class Testconnection {
    public static void main(String[] args) {
        String url="jdbc:h2:~/test";
        try{
    Class.forName("org.h2.Driver");
    System.out.println("driver loaded");
    Connection con=DriverManager.getConnection(url,"sa","");
    System.out.println("connection established");
    con.close();
        }
        catch(ClassNotFoundException e){
            System.out.println("driver is found");
        }
        catch(SQLException e){
            System.out.println("connection is not established");
        }
        }
}

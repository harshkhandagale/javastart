package j2ee;
// for giving the path
// javastart (project ) rigth click
// open module setting -> module tab -> + icon -> jars or direc -> find mysqlconnector.jar file
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Establish_connection {
    public static void main(String[] args){
        //loading and register
        //Specify to the DriverManager which JDBC drivers to try to make Connections with.
        // The easiest way to do this is to use Class.forName() on the class that implements the java.sql.Driver interface.
        // With MySQL Connector/J, the name of this class is com.mysql.cj.jdbc.Driver.
        // With this method, you could use an external configuration file to supply the driver class name and driver parameters to use when connecting to a database.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // connection -> interface
            // DriverManager -> class, getConnection ->method(static)
            // after creating the table then add /jdbc_testing i.e dbName to the url
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_testing", "root", "jaibhim125");
            System.out.println("connection succesfull");
            //create statement - non-satic method
            Statement st = con.createStatement();
            //execute statement
            // st.execute("create database jdbc_testing");   //you have to comment this beacuse database is already created othrwise error


            System.out.println("database created");
            st.execute("create table stud1(id int , name varchar(25),  salary int)");
            System.out.println("table created");
            st.execute("insert into stud1(id,name,salary) values (1,'harsh',200)");
            System.out.println("values inserted");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }



    }
}

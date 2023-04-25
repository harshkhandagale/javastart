package j2ee;
//          Using execute() method to execute general query.
//        Using executeUpdate() method to execute INSERT, UPDATE or DELETE query
//        Using executeQuery() method to execute SELECT query.
import java.sql.*;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //load...learn this//jdbc url
            //register....learn this url
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","jaibhim125");
            System.out.println("connected");
            Statement st = con.createStatement();
//            st.execute("create database demo2");
//            System.out.println("db created");
//            st.execute("create table stud2(id int, name varchar(25))");
            System.out.println("table created");
            st.execute("insert into stud2 values(2,'harsh')");
            st.execute("insert into stud2 values(3,'umesh')");
            st.execute("insert into stud2 values(3,'umesh')");

            //update
            st.execute("update stud2 set name='arbaaz' where id=3");
            //delete
            st.execute("delete from stud2 where id=1");
            //showing results in terminal
            // executeQuery returns result set
            ResultSet rs = st.executeQuery("SELECT * FROM stud2");



            while (rs.next()){   // takes cursor to next row
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.format("%s,%s\n",id,name);
            }





        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}

package j2ee;

import java.sql.*;
import java.util.Scanner;

public class Batch_preparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","jaibhim125");
            Statement st = con.createStatement();
            PreparedStatement ps = con.prepareStatement("insert into stud2(id,name) values (?,?)");
            for (int i =1;i<=3;i++){
                System.out.println("enter id ");
                Scanner sc= new Scanner(System.in);
                int id = sc.nextInt();
                ps.setInt(1,id);
                System.out.println("enter name  ");
                String name = sc.next();
                ps.setString(2,name);
                ps.addBatch();
            }
            ps.executeBatch();
            System.out.println("inserted success");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}


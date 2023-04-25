package j2ee;

import java.sql.*;
import java.util.Scanner;
import java.util.Stack;

public class InsertValuesDynamically {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","jaibhim125");
            Statement st = con.createStatement();
            // since we dont know , what a user may input therfore we use placeholders
            PreparedStatement ps = con.prepareStatement("insert into stud2(id,name) values(?,?)");  //?? are the placeholeders
            Scanner sc = new Scanner(System.in);

            for (int i=1;i<=5;i++){   //if i want 5 entries to insert
                System.out.println("enter id");
                int id = sc.nextInt();
                System.out.println("enter name");
                String name = sc.next();

                ps.setInt(1,id);        //1. first placeholder -> ?
                ps.setString(2,name);   //2. second placholder -> ?

                ps.execute();
            }
            System.out.println("data inserted");


        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

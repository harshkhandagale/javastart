package j2ee;

import java.sql.*;
import java.util.Scanner;

public class DeleterData {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","jaibhim125");
            System.out.println("connected");
            Statement st = con.createStatement();
            PreparedStatement ps1 = con.prepareStatement("delete from stud2 where id=?");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id");
            int id1 = sc.nextInt();
            boolean flag = false;



            ResultSet rs1 = st.executeQuery("select id from stud2");
            while(rs1.next()){
                if (id1==rs1.getInt("id")){
                    ps1.setInt(1,id1);  // only one placholder
                    flag = true;
                }
                else {
                    flag = false;
                }

            }
            if (flag = true){
                ps1.execute();
                System.out.println("deleted succefully");
            }else {
                System.out.println("no id available");
            }




        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}

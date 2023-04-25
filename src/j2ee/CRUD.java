package j2ee;

import java.sql.*;
import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","jaibhim125");
        System.out.println("connected");
        Statement st = con.createStatement();
//        st.execute("create table User( id int , name varchar(25), email varchar(25) )");
//        System.out.println("Table created");


        System.out.println("1.Insert");
        System.out.println("2.Update");
        System.out.println("3.Delete");
        System.out.println("4.View");
        System.out.println("Enter your option");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt){
            case 1: {
                PreparedStatement ps = con.prepareStatement("insert into User(id, name, email) values (?,?,?) ");
                System.out.println("you selected Insert");
                System.out.println("How many values you want to insert");
                int val = sc.nextInt();
                for (int i = 1;i<=val;i++){
                    System.out.println("insert id");
                    int id = sc.nextInt();
                    ps.setInt(1,id);
                    System.out.println("Insert name");
                    String name = sc.next();
                    ps.setString(2,name);
                    System.out.println("Insert email");
                    String email = sc.next();
                    ps.setString(3,email);
                    ps.execute();
                    System.out.println("data inserted");
                }

                break;
            }
            case 2: {
                PreparedStatement ps = con.prepareStatement("update User set id=?, name=?, email=? where  id=?) ");
                System.out.println("you selected Update");
                System.out.println("Enter id you want to update");
                int id = sc.nextInt();
                ps.setInt(1,id);
                System.out.println("enter new name");
                String name = sc.next();
                ps.setString(2,name);
                System.out.println("enter new email");
                String email = sc.next();
                ps.setString(3,email);
                ps.execute();
                System.out.println("Update successfull");
                break;
            }
            case 3:{
                System.out.println("you selected delete");
                PreparedStatement ps1 = con.prepareStatement("delete from User where id=?");
                System.out.println("Enter id");
                int id1 = sc.nextInt();
                ps1.setInt(1,id1);
                boolean flag = false;
                ResultSet rs1 = st.executeQuery("select id from User");
                while(rs1.next()){
                    if (id1==rs1.getInt("id")){
                        ps1.setInt(1,id1);
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
                break;
            }
            case 4:{
                System.out.println("you selected view");
                PreparedStatement ps = con.prepareStatement("Select * from User");
                ResultSet rs = ps.executeQuery();       //for result set we need executeQuery
                while(rs.next()){
                    System.out.println("id : "+rs.getInt("id"));
                    System.out.println("name : "+rs.getString("name"));
                    System.out.println("name : "+rs.getString("email"));
                }
                break;

            }
        }

    }
}

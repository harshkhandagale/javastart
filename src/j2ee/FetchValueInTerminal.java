package j2ee;
// for prepared statement set in imp***************
// while fetching values resultset is mandatory
import java.sql.*;
import java.util.Scanner;

public class FetchValueInTerminal {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","jaibhim125");
            System.out.println("connected");
            Statement st = con.createStatement();
            PreparedStatement ps1 = con.prepareStatement("select * from stud2 where id=?");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id");
            int id1 = sc.nextInt();

            ps1.setInt(1,id1);  // only one placholder
            ResultSet rs1 = ps1.executeQuery();


            while(rs1.next()){
                System.out.println("id : "+rs1.getInt("id"));
                System.out.println("name : "+rs1.getString("name"));
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

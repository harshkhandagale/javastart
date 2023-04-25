package j2ee;
// batch sends request as a whole/single batch unit
// this s batch with statement...but not efficient beacause it sends 1000 req and send 1000 response and compiles 1000 times
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_statement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","jaibhim125");
            Statement st = con.createStatement();
            st.addBatch("insert into stud2 values(1,'harsh')");
            st.addBatch("insert into stud2 values(2,'arbaaz')");
            st.addBatch("insert into stud2 values(3,'kunal')");
            st.addBatch("insert into stud2 values(4,'hemant')");
            st.executeBatch();
            System.out.println("sucess");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}

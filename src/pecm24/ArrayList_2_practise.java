//WAP to validate in attendance , the batch, the phone number , th email
package pecm24;
import java.util.ArrayList;

class Attendance{
    String name;
    String batch;
    String email;
    String phno;
    public Attendance(){
    }
    public Attendance(String name, String batch,String email,String phno){
        this.name = name;
        this.email=email;
        this.batch=batch;
        this.phno=phno;
    }
    public String toString(){
        return "[name:"+name+","+" batch:"+batch+","+" email:"+email+","+" phno:"+phno+"]";
    }
}

public class ArrayList_2_practise {

    public static void main(String[] args) {
        //upcasting is done here
        ArrayList list = new ArrayList<>();
        list.add(new Attendance("Harsh","PECM24","harsh@gmail.com","9145470171"));
        list.add(new Attendance("kunal","PECM26","harsh@123.com","914547011"));
        list.add(new Attendance("hemant","PECM24","hemant@gmail.com","8945470171"));
        list.add(new Attendance("siddi","PECM24","siddi@google.com","6745470171"));
        list.add(new Attendance("shreya","PECM27","shrrya@gmail.com","3345470171"));
        System.out.println("student allowed in batch are");
        System.out.println(checkBatch(list,"PECM24")); //just keeping PECM 24 batch
        System.out.println("students with wrong number");
        checkPhno(list);
        System.out.println("students with wrong email");
        checkEmail(list);
    }


    //Method to check batch
    public static ArrayList checkBatch(ArrayList list, String batchcode){
        ArrayList filter = new ArrayList<>();
        for (int i = 0;i<list.size();i++){
            Attendance a1 = (Attendance) list.get(i);   //downcasting because list has object ref only
            if (a1.batch.equals(batchcode)){
                filter.add(a1);
            }
        }
        return filter;
    }

    //Method to check phno
    public static void checkPhno(ArrayList list){
        for (int i = 0;i<list.size();i++){
            Attendance a1 = (Attendance) list.get(i);
            if (a1.phno.length()==10){
                int ch = a1.phno.charAt(0);
                if (ch>='6'&&ch<='9'){
                    continue;
                }
                else {
                    System.out.println(a1.name+" has given wrong number");
                }
            }
            else {
                System.out.println(a1.name+" has given wrong number");
            }
        }
    }

    //Method to check email
    public static void checkEmail(ArrayList list){
        for (int i = 0;i<list.size();i++){
            Attendance a1 = (Attendance) list.get(i);
            if (a1.email.endsWith("@gmail.com")||a1.email.endsWith("@yahoo.com")){
                continue;
            }
            else {
                System.out.println(a1.name+" has provide invalid email");
            }
        }
    }

}

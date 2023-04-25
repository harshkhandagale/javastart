package pecm24;
class  UPI{
    String id;
    int pin;
    UPI(){}
    UPI(String id, int pin){
        this.id = id;
        this.pin = pin;
    }
    public void diplay_UPI(){
        System.out.println("id "+id);
        System.out.println("pin "+pin);
    }
}
class Gpay extends  UPI{
    String bank;
    int acc_no;
    Gpay(){}
    Gpay(String id, int pin ,String bank, int acc_no){
        super(id,pin);
        this.bank = bank;
        this.acc_no = acc_no;
    }
    public void diplay_Gpay(){
        System.out.println("id "+id);
        System.out.println("pin "+pin);
        System.out.println("bank "+bank);
        System.out.println("acc_no "+acc_no);
    }
}
public class up_downCasting {
    public static void main(String[] args) {
        Gpay g1 = new Gpay("k11",435,"Kotak",123456);
        UPI u1 = g1;  //UPCASTING
        u1.diplay_UPI();
        //u1.display_Gpay();  // CTE error cannot access member of Subclass in upcasting
        //there fore we do downcasting which is explicitly down by the programmer
        Gpay gp1 = (Gpay) u1;
//        gp1.diplay_UPI();
        System.out.println();
        gp1.diplay_Gpay();


        //Note :-> downcasting nees upcasting first, else it will throw class cast
//                   exeption
        // for eg:
        UPI u2 = new UPI();
        Gpay gp2 = (Gpay) u2; // runtime error ...class cast exeption

    }

}

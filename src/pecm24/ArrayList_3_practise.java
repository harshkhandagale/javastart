//WAP to check if a persoj can donate his/her blood by checking the given conditions
// not done do it
package pecm24;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.ArrayList;

class People{
    String name;
    int age;
    String donatedDate ;
    public People(){}
    public People(String name ,  int age, String donatedDate){
        this.name = name;
        this.age=age;
        this.donatedDate=donatedDate;
    }
    public String toString(){
        return "[name:"+name+","+" age:"+age+","+" donatedDate:"+donatedDate+"]";
    }
}
public class ArrayList_3_practise{
    //Method to check if a person can donate blood ...keeping in mind that he cannot donate
    // if he has donated within 3 months , and he cannot donate if he is less than  18 years
    public static ArrayList validateDoners(ArrayList list , String todays_date){
        Period p = Period.parse(todays_date);
        ArrayList filterDate = new ArrayList<>();
        for (int i =0;i<list.size();i++){
            People p1 = (People) list.get(i);
            if (p1.age>18){
                filterDate.add(p1);
            }
            else {
                continue;
            }
        }
        return filterDate;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(new People("Harsh",24,"12/10/2022"));
        list.add(new People("kunal",17,"12/10/2016"));
        list.add(new People("Heamnt",29,"12/10/2023"));
        list.add(new People("rushi",16,"12/10/2023"));
        list.add(new People("shreya",50,"12/10/2021"));
        System.out.println(validateDoners(list,"P17Y9M5D"));

    }
}

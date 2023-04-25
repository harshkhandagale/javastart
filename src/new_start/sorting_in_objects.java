package new_start;

class Sort{
    String name ;
    double weight;
    Sort(){
        //Default constructor
    }
    Sort(String name , double weight){
        this.weight = weight;
        this.name=name;
    }

    public void diplaySort(){
        System.out.println("name: "+name);
        System.out.println("weight: "+weight);
    }


}



public class sorting_in_objects {


//Method for sorting weights
    //Sort[] -> array return type, SortArray -> method name
    public static Sort[] SortArray(Sort[] s1){
        Sort temp;
        for (int i = 0; i< s1.length;i++){
            for (int j = i+1;j<s1.length;j++){
                if (s1[i].weight > s1[j].weight){
                    temp = s1[i];
                    s1[i]= s1[j];
                    s1[j] = temp;
                }
            }
        }
        return s1;
    }

    public static void main(String[] args) {

        Sort s1 [] = new Sort[5];
        s1[0] = new Sort("Harsh", 23.3);
        s1[1] = new Sort("Hemant", 83.3);
        s1[2] = new Sort("Shantany", 53.3);
        s1[3] = new Sort("Kunal", 13.3);
        s1[4] = new Sort("Arbaaz", 73.3);

        System.out.println("Sorted Weigths are ");
        Sort sorted_ans[] = SortArray(s1);
        for (int i =0;i<sorted_ans.length;i++){
            sorted_ans[i].diplaySort();
        }
    }
}

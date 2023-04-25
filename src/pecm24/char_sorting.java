package pecm24;
// merging two char arrays and sorting them
public class char_sorting {
    public static void main(String[] args) {
        char s1 [] = {'a','z','b','e','f','i'};
        char s2 [] = {'c','y','d','x','m'};
        int l  = s1.length + s2.length;
        char s3 [] = new char[l];
        for (int i =0;i<s1.length;i++){
            s3[i] = s1[i];
        }
        for (int i = 0;i<s2.length;i++){
            s3[s1.length+i] = s2[i];
        }
        char temp;
        for (int i = 0;i< s3.length-1;i++){
            for (int j =0;j<s3.length-1-i;j++){
                if (s3[j]>s3[j+1]){
                    temp = s3[j];
                    s3[j] = s3[j+1];
                    s3[j+1] = temp ;
                }
            }
        }
        for (int i =0;i<s3.length;i++){
            System.out.println(s3[i]);
        }
    }
}

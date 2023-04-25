package DSA;

public class array {
/*
    //1.Display an array
    public void dispalyArray(int [] arr){
        int n = arr.length;
        for (int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
 */
/*
    //2.
    public void RemoveEvenArray(int[] arr){
        int n = arr.length;
        int idx=0;
        for (int i =0;i<n;i++){
            if (arr[i]%2!=0){
                idx++;
            }
        }
        int [] result = new int[idx];
        int index = 0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2!=0){
                result[index] = arr[i];
                index++;
            }
        }
        //Printing
        for (int i =0;i< result.length;i++){
            System.out.println(result[i]);
        }
    }
 */
/*
//    3.Reverse array by swapping
    public static void reverseArray(int [] arr, int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int [] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
 */
/*
    //4.Smallest element in array
    public int smallestElement(int [] arr){
        int min = arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
 */
/*
    //5.Second Smallest element in array
    public int secondSmallestElement(int [] arr){
        int min = arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        int a =1000;
        for (int i =0;i<arr.length;i++){
            if (arr[i]!=min && arr[i]<a){
                a=arr[i];
            }
        }
        return a;
    }
 */
/*
    //6.Second largest element
    public int secondLargest(int [] arr){
        int max = 0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }{2,11,5,10,7,8};
        int a =arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]!=max && arr[i]>a){
                a=arr[i];
            }
        }
        return a;
     }
 */
/*
    //moving zeros to the end of array
    public void moveZero(int [] arr, int n ){
        int j =0;
        for (int i =0;i<n;i++){
            if (arr[i]!=0 && arr[j]==0){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j]!=0){
                j++;
            }
        }
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
 */
/*
    //Resizing an array
    public int [] resize(int [] arr, int capacity){
        int [] temp = new int [capacity];
        for (int i =0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr=temp;
        return arr;
    }
*/
/*
    //Finding missing element in array of range 1 - n
    public int findMissingNum(int [] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for (int num : arr){
            sum=sum-num;
        }
        return sum;
    }
*/
/*
    //Checking plaidrom String or not
    public boolean palindromeString(String str){
        int start =0;
        int end = str.length()-1;
        char [] charArr = str.toCharArray();
        while (start<end){
            if (charArr[start] != charArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
*/














    public static void main(String[] args) {
//        1.
//        array a1 = new array();
//        a1.dispalyArray(new int [] {1,4,2,3});

//        2.remove even element
//        int [] arr = {3,2,4,7,10,6,5};
//        array a1 = new array();
//        a1.RemoveEvenArray(arr);

//        3.reverse an array
//        int [] arr = {2,11,5,10,7,8};
//        reverseArray(arr, 0,arr.length-1);
//        printArray(arr);

//        4. smallest element in array
//        int [] arr = {2,11,5,10,7,8};
//        array a1 = new array();
//        System.out.println(a1.smallestElement(arr));

//        Second Smallest element in array
//        int [] arr = {2,11,5,10,7,8};
//        array a1 = new array();
//        System.out.println(a1.secondSmallestElement(arr));

//        Second Largst element in array
//        int [] arr = {2,11,5,10,7,8};
//        array a1 = new array();
//        System.out.println(a1.secondLargest(arr));

//        Move zeros to the end of array
//        int [] arr= {8,1,0,2,1,0,3};
//        array a1 = new array();
//        a1.moveZero(arr,7);

//        Resizing an array
//        int [] arr = {5,9,3,10};
//        array a1 = new array();
//        arr = a1.resize(arr,10); //storing in a variable is imp, becuase it will show the previous array length i.e4
//        System.out.println(arr.length);   //  o/p->10


//        Finding missing element in array of range 1 - n
//        int []arr = {2,4,1,8,6,3,7};
//        array a1 = new array();
//        System.out.println("The missing value is "+a1.findMissingNum(arr));


//        Checking plaidrom String or not
//        String str = "madam";
//        array a1 = new array();
//        if (a1.palindromeString(str)){
//            System.out.println("Palindrom string");
//        }
//        else {
//            System.out.println("Not Palindrom String");
//        }












    }
}

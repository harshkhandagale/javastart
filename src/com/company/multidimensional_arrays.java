//Multidimension arrays means arrays in array;
//take example of flats  , array of 2 --> 2 floors , in that 4 flats on each row, eg:below given
package com.company;

public class multidimensional_arrays {
    public static void main(String[] args) {
        int [][] flats ;  //2D Array
        flats = new int [2][3]; //imagine 2 rows 3 columns i.e 2->floors , 3 flats in each row
        //But the indexing is from 0 zero , therefore 0,1->rows   and   0,1,2->columns
        //on first floor
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        //on 2nd floor
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        System.out.println(flats.length);
        System.out.println("Flats in 0th row : "+flats[0].length);
        System.out.println("Flats in 1st row : "+flats[1].length);
        //printing every row with there elemenyts
        for (int i=0; i< flats.length;i++){
            for (int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }

        //You can create multidimensional sting arrays also

    }
}

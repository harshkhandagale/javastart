package com.company;
import java.util.Random;
import java.util.Scanner;
//import java.util.random.RandomGenerator;
public class RockPaperScissor {
    public static void main(String[] args) {
        Random rm = new Random();
        int random = rm.nextInt(2);  // Generates random integers 0 to 2

        //Comparing random number generated by the comp and the user input number
        //playing 5 times
        int i =0;
        while (i<5) {
            System.out.println("what you would go for?");
            System.out.println("Enter 0 for rock");
            System.out.println("Enter 1 for paper");
            System.out.println("Enter 2 for scissor");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (random == a) {
                System.out.println("draw match");
            } else if (a == 0 && random == 2 || a == 2 && random == 1 || a == 1 && random == 0) {
                System.out.println("computer generated, " + random + " your choice was : " + a + " you win");
            } else {
                System.out.println("computer generated, " + random + " your choice was : " + a + " you Loose");
            }
            i++;
        }

    }
}

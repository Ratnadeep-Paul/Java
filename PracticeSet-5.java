package com.sharpwebtechnologies.learn;
import java.util.Scanner;

public class Java_PracticeSet_CH_05 {
    public static void main(String[] args) {
        // Question No 1 -- Write a code to print the following pattern
        /*
        ****
        ***
        **
        *
        */
        // Solution:
        byte n = 4;
        for (int i=n; i>0; i--){
            for (int j = 0; j<i; j++) {
                System.out.println("*");
            }
        }


    // Done Here
    // ------------------------XXXXXXX------------------------

    // Question No 2 -- Write a program to sum first n even numbers using while loop.
    // Solution:

      /

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 3 -- Write a program to print multiplication table of given number n.
        // Solution:

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Which Multiplication Table You Want To Print\n:- ");
        int n = input.nextInt();
        System.out.println("The Multiplication Table Of " + n + " Is:--");
        for (int i = 1; i<11; i++){
            System.out.println(n + " * " + i + " = " + i*n);
        }

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 4 -- Write a program to print multiplication table of 10 in reverse order.
        // Solution:

        int n = 10;
        System.out.println("The Multiplication Table Of " + n + " In Reverse Order Is:--");
        for (int i = 10; i>0; i--){
        System.out.println(n + " * " + i + " = " + i*n);
        }

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 5 -- Write a program to find factorial of given number using for loops.
        // Solution:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Which Factorial You Want To Print\n:- ");
        int n = input.nextInt();
        System.out.println("The Factorial Of " + n + " Is:--");
        int factor = 1;
        int factN = n;
        for (int i=0; i<n; i++){
            factor = factor * (factN);
            factN--;
        }
        System.out.println(factor);

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 6 -- Write a program to find factorial of given number using while loops.
        // Solution:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Which Factorial You Want To Print\n:- ");
        int n = input.nextInt();
        System.out.println("The Factorial Of " + n + " Is:--");
        int factor = 1;
        int factN = n;
        int i = 0;
        while (i<n){
            factor = factor * (factN);
            factN--;
            i++;
        }
        System.out.println(factor);

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 7 -- Write a code to print the following pattern using while loop
        /*
         ****
         ***
         **
         *
         */
        // Solution:
        byte n = 4;
        byte i = 0;
        while (i<n){
        byte j = 0;
        while (j<n){
        System.out.print("*");
        j++;
        }
        System.out.print("\n");
        n--;
        }

        // Done Here
        // ------------------------XXXXXXX------------------------


        // Question No 9 -- Write a program to calculate the sum of the numbers occurring in the multiplication
        // table of 8.
        // Solution:

        int n = 8;
        int sum = 0;
        System.out.println("The Sum of the numbers occurring in the multiplication table of 8 is :--- ");
        for (int i = 1; i<11; i++){
             sum = sum + i*n;
        }
        System.out.print(sum);

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 10 -- Write a program to sum first n even numbers using for loop.
        // Solution:

         int n = 5;
         int sum = 0;
         for (int i = 0; i<n; i++){
             int even = 2*i;
             sum = sum + even;
             System.out.println("\t"+even);

             if (i==(2-n)){
                 break;
             } else {
                System.out.println("\t+");
             }
         }

         System.out.println("____________");
         System.out.println("\t"+sum);

        // Done Here
        // ------------------------XXXXXXX------------------------
}
}

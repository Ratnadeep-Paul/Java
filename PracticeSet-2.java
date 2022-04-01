package com.sharpwebtechnologies.learn;
import  java.util.Scanner;

public class Java_PracticeSet_CH_02 {
    public static void main(String[] args) {
        // Question No 1 -- What will be the result of the following expression.
        // float a = 7/4 * 9/2;
        // Solution:
        float a = 4;

        // Done Here
        // ------------------------XXXXXXX------------------------

        /* Question No 2 -- Write a Java program to encrypt a grade by adding 8 to it.
           Decrypt it to show the correct grade */
        // Solution:

        // --- Encrypt
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);

        // --- Decrypt
        grade = (char)(grade-8);
        System.out.println(grade);

        // Done Here
        // ------------------------XXXXXXX------------------------

        /* Question No 3 -- Use compression character to find out whether a given number is greater from the
           user's entered number or not */
        // Solution:

        Scanner input = new Scanner(System.in);
        int a = 55;
        System.out.println("Enter A Number To Check Your Number Is Greater Than My Number Or Not:");
        int b = input.nextInt();
        System.out.println("If it shows 'true' that means You Entered A Greater Number, Otherwise You Entered A Lesser Number");
        System.out.println(b>a);

        // Done Here
        // ------------------------XXXXXXX------------------------

        /* Question No 4 -- Write the following expression in a Java program.
           V^2 - U^2
           ---------
             2qS*/
        // Solution:
        int v = 1;
        int u = 2;
        int a = 3;
        int s = 4;
        int ans = (v*v - u*u) / (2*a*s);

        // Done Here
        // ------------------------XXXXXXX------------------------

        /* Question No 4 -- Find the value of the following expression.
           int x = 7;
           int a = x * 49 / x + 35 / x;
         */

        // Solution:
        int a = 54;

        // Done Here
        // ------------------------XXXXXXX------------------------
    }
}

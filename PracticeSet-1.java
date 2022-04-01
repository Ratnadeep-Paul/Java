package com.sharpwebtechnologies.learn;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Java_PracticeSet_CH_01 {
    public static void main(String[] args) {
        // Question No 1 -- Write a program to sum three numbers.
        // Solution:

       int num1 = 6;
       int num2 = 12;
       int num3 = 72;

       int sum = num1 + num2 + num3;
       System.out.println(sum);

          // Done Here
          // ------------------------XXXXXXX------------------------

        // Question No 2 -- Write a program to calculate CGPA using marks of three subjects (out of 100)
        // Solution:

       float mark1 = 45;
       float mark2 = 56;
       float mark3 = 88;

       float fullMarks = mark1 + mark2 + mark3;
       float markAvg = fullMarks/3;
       float CGPA = markAvg/10;
       System.out.println(CGPA);

        // Done Here
        // ------------------------XXXXXXX------------------------

        /* Question No 3 -- Write a program which ask the user to enter her/his name and greets them -
           -with "Hello <name>, Have a Good Day!" text. */
//         Solution:

       Scanner input = new Scanner(System.in);
       System.out.println("Please Enter Your Name:");
       String name = input.nextLine();

       System.out.println("Hello " + name + ", Have a Nice Day!");

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 4 -- Write a program to convert Kilometers to Miles
        // Solution:

       Scanner input = new Scanner(System.in);
       System.out.println("Welcome To KM<-->Mile Converter");
       System.out.println("Enter The Count Of Kilometres:");
       float km = input.nextFloat();
       float mileCount = 0.621f;
       double miles = km * mileCount;

       DecimalFormat formatter = new DecimalFormat("#.###");
       String formatted = formatter.format(miles);
       System.out.println(km + " Kilometre is " + formatted + " Miles");

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 5 -- Write a program to detect whether a number entered by user is an integer or not
        // Solution:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, I will tell you that is it an integer or not:");
        boolean checkInt = input.hasNextInt();

        if (checkInt){
            System.out.println("Yes!! It's an Integer");
        } else {

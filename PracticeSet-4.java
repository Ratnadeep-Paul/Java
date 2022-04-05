package com.sharpwebtechnologies.learn;
import java.util.Scanner;
import java.math.BigDecimal;

public class Java_PracticeSet_CH_04 {
    public static void main(String[] args) {
        // Question No 1 -- What will be the output of the following Program
        // Solution:
        /* int a = 10;
         if (a=10){
             System.out.println("I am 11");
         } else{
             System.out.println("I am not 11");
         } */
        // Solution:

        System.out.println("This Will Show An Error");

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 2 -- Write a Java program to find out wheater a student is pass or fail.
        // If it retains total 40% and at least 33% in each subject to pass.
        // Assume 3 subjects and take marks as an input from the user.
        // Solution:

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Mark Of 1st Subject\n:- ");
        int mark_1 = input.nextInt();
        System.out.print("Enter The Mark Of 2nd Subject\n:- ");
        int mark_2 = input.nextInt();
        System.out.print("Enter The Mark Of 3rd Subject\n:- ");
        int mark_3 = input.nextInt();

        int sum_marks = mark_1 + mark_2 + mark_3;
        float total_percent = sum_marks/3;

        if (total_percent>=40){
            if (mark_1>=33 && mark_2>=33 && mark_3>=33 ){
                System.out.println("You Are Pass In Your Exam");
                System.out.println("And Your Total Mark Is: " + sum_marks);
                System.out.println("And Your Percentage Is: " + total_percent + "%");
            }
            else {
                System.out.println("You Failed In Your Exam Because Of Your Subjects Marks");
            }
        } else {
            System.out.println("You Failed In Your Exam Because Of Your Total Marks");
        }

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 3 -- Calculate income tax paid my an employee to the government as per the slots mentioned below.
        /*
           Income Slot              Tax
           2.5L - 5.0L              5%
           5.0L - 10.0L             20%
           Above 10.0L              30%
        */
        // Solution:

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Income Tax Scanner");
        System.out.print("Please Enter Your Annual Income In Full Number (e:g 248610):- ");
        long income = input.nextLong();

        if (income>1000000){
            double tax = (income/100 * 30);
            System.out.println("Your Income Is " + income + " So Your Have To Pay 30% Of Your Income");
            System.out.println("And The 30% Of Your Income Is: " + new BigDecimal(tax).toBigInteger());
        } else if (income>500000){
            double tax = (income/100 * 20);
            System.out.println("Your Income Is " + income + " So Your Have To Pay 20% Of Your Income");
            System.out.println("And The 20% Of Your Income Is: " + new BigDecimal(tax).toBigInteger());
        } else if (income>250000){
            double tax = (income/100 * 5);
            System.out.println("Your Income Is " + income + " So Your Have To Pay 5% Of Your Income");
            System.out.println("And The 5% Of Your Income Is: " + new BigDecimal(tax).toBigInteger());
        } else {
            System.out.println("You Don't Have To Pay Any Tax");
        }

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 4 -- Write a Java program to find out the day of the week given the number
        // [1 for Monday, 2 from Tuesday ... and so on!]
        // Solution:

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of The Day:- ");
        byte dayNum = input.nextByte();

        switch (dayNum){
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("You Enter A Wrong Number");
        }

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 5 -- Write a Java program to find whether a year entered by the user is a leap year or not.
        // Solution:

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Year:- ");
        int year = input.nextInt();

        if(year%4==0){
        System.out.println("Yes!! " + year + " is a Leap Year");
        } else {
        System.out.println("No!! It's Not  A Leap Year");
        }

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 5 -- Write a Java program to find out the type of website url.
        /*
        .com = Commercial Website
        .org = Organization Website
        .in = Indian Website
         */
        // Solution:

         Scanner input = new Scanner(System.in);
         System.out.print("Please Enter The URL:- ");
         String url = input.next();
         boolean ending = url.endsWith("/");
         int lenUrl = url.length();

         if (ending==true){
             url = url.substring(0, lenUrl-1);
             if (url.indexOf(".org", 0)!=-1){
                 System.out.println(url + " - Is a Organization Website");
             } else if (url.endsWith(".com")){
                 System.out.println(url + " - Is a Commercial Website");
             } else if (url.endsWith(".in")){
                 System.out.println(url + " - Is a Indian Website");
             } else {
                 System.out.println("Website Type Undefined");
             }
         } else {
                 if (url.endsWith(".org")) {
                     System.out.println(url + " - Is a Organization Website");
                 } else if (url.endsWith(".com")) {
                     System.out.println(url + " - Is a Commercial Website");
                 } else if (url.endsWith(".in")) {
                     System.out.println(url + " - Is a Indian Website");
                 }
                 else {
                     System.out.println("Website Type Undefined");
                 }
         }
    }
}


package com.java.learn;
import java.util.Scanner;

public class APP_03_KM2Miles {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome To KM<-->Mile Converter");
       System.out.println("Enter The Count Of Kilometres:");
       float km = input.nextFloat();
       float mileCount = 0.621f;
       double miles = km * mileCount;

       DecimalFormat formatter = new DecimalFormat("#.###");
       String formatted = formatter.format(miles);
       System.out.println(km + " Kilometre is " + formatted + " Miles");
    }
}

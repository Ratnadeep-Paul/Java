package com.java.learn;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class APP_01_StarPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Row Count You Want:");
        short num = input.nextShort();
        short i = 1;
        String star = "*";
        while((num+1)>i){
            System.out.println(star.repeat(i));
            i++;
        }
    }
}

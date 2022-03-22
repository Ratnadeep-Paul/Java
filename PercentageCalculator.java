package com.java.learn;
import java.util.Scanner;

public class APP_02_PercentageConverter {
    public static void main(String[] args) {
        // This Program Will Help Students To Find Their Percentage Of Exam
        // They Have To Input Their Marks And The Program Will Tell Them The Percentage
        Scanner input = new Scanner(System.in);
        System.out.println("How Many Subjects You Have:");
        byte subs = input.nextByte();
        int fullMarks = subs*100;
        byte i = 1;
        float mark = 0;
        while (i<subs+1){
            System.out.println("Enter The Mark Of No " + i + " Subject:");
            float inputMark = input.nextByte();
            mark = mark + inputMark;
            i++;
        }

        float percent = mark/subs;
        System.out.println("You Got " + mark + " Out Of " + fullMarks);
        System.out.println("And You Got " + percent + "% In Your Exam");
    }
}

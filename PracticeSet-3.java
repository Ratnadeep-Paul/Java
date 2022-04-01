package com.sharpwebtechnologies.learn;

import java.util.Locale;

public class Java_PracticeSet_CH_03 {
    public static void main(String[] args) {
        // Question No 1 -- Write a Java program to convert a String to lowercase.
        // Solution:

        String name = "Ratnadeep Paul";
        String lowerName = name.toLowerCase();
        System.out.println(lowerName);

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 2 -- Write a Java program to replace spaces with underscore.
        // Solution:

        String name = "My Name Is Ratnadeep Paul";
        String noSpaceName = name.replace(" ", "_");
        System.out.println(noSpaceName);

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 3 -- Write a Java program to fill in a letter template which looks like below.
        // Letter = "Dear <name>, Thanks a lot"
        // Replace name with a string (some name)
        // Solution:

        String letter = "Dear <name>, Thanks A Lot";
        letter = letter.replace("<name>", "Ratnadeep");
        System.out.println(letter);

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 2 -- Write a Java program to detect double and triple spaces in a String.
        // Solution:

        String myStr = "This String Contain  double and    triple spaces";
        System.out.println(myStr.indexOf("  "));
        System.out.println(myStr.indexOf("   "));

        // Done Here
        // ------------------------XXXXXXX------------------------

        // Question No 2 -- Write a Java program to format the following letter using escape sequence character.
        // letter = "Dear Ratnadeep, This Java Program Is Nice. Thanks"
        // Solution:

        String letter = "Dear Ratnadeep, \n\tThis Java Program Is Nice. \n\tThanks";
        System.out.println(letter);
    }
}

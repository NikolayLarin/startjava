package com.startjava.lesson_04.strings;

import java.util.regex.Pattern;

public class StringsIntroMain {

    public static void main(String[] args) {
        String text1 = "     FIFA will   . ;   never regret it  ^^^^^^^^      ";
        String[] words1 = text1.split("\\s*(\\s|,|!|\\.)\\s*");
        String[] str1 = new String[words1.length];
        System.out.println(text1.length());
        System.out.println(words1.length);
        for (int i = 0; i < words1.length; i++) {
            str1[i] = words1[i];
            System.out.println(str1[i]);
        }
        System.out.println(text1.replaceAll("\\s+", "/+-*^%_\\\\\\\\"));
        System.out.println(text1.replaceAll("\\s", "/+-*^%_\\\\\\\\"));
        System.out.println(text1.replaceAll("\\s*", "/+-*^%_\\\\\\\\") +
                "\n_______________________________");


        String text2 = "     10  -  20 + 501 / 311 % 40000 ^           111111";
//        String[] words2 = text2.split("\\s*(\\s|\\+|-|/|\\*|\\^\\.)\\s*");
        text2 = text2.replaceAll("\\s+", "");
        String[] words2 = text2.split("\\s*(\\+|-|\\*|/|\\^|%)\\s*");
        String[] str2 = new String[words2.length];
        System.out.println(text2.length());
        System.out.println(words2.length);

        System.out.println("IIIIIIIIIIII");
        for (int i = 0; i < words2.length; i++) {
            str2[i] = words2[i];
            System.out.println(str2[i]);
        }
    }
}

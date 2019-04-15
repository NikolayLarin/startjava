package com.startjava.lesson_04.array_intro;

public class ArrayMain {

    public static void main(String[] args) {

        int[] numbers = new int[6];
        float[] numbers1 = {165.5f, 0.5f, .5f};


        System.out.println(numbers.length);
        System.out.println(numbers1.length);
        System.out.println("[ - одномерный массив типа I - инт " +
                "и его хэш-код после разделителя @: " + numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "; ");
        }
        System.out.println();

        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + "; ");
        }
        System.out.println();

        // it work with collection
        for (int i : numbers) {
            System.out.print(numbers1[i] + "; ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.print(numbers[i] + "; ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.print(numbers[i] + "; ");
        }
        System.out.println();

        String[] text = new String[3];
        for (String string : text) {
            System.out.print(string + "; ");
        }
        System.out.println();
    }
}
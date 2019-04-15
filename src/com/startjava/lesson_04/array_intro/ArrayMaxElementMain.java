package com.startjava.lesson_04.array_intro;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int arrayLenght = scanner.nextInt();
        int[] numbers = new int[arrayLenght];

        System.out.print("Заполните массив целыми числами через пробел: ");
        for (int i = 0; i < arrayLenght; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 0; i < arrayLenght -1; i++) {
            if (max < numbers[i + 1]) {
                max = numbers[i+1];
            }
        }
        System.out.println("Максимальное число = " + max);
    }
}

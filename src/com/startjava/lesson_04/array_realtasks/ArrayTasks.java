package com.startjava.lesson_04.array_realtasks;

import java.util.Random;

public class ArrayTasks {

    private User user;

    public ArrayTasks(User user) {
        this.user = user;
    }

    public void startOperate(User user) {
        int[] array = activateArray(user);
        if (user.getChoice() == 1) {
            sumEvenNumbers(array);
        } else if (user.getChoice() == 2) {
            findLessThenAverage(array);
        } else if (user.getChoice() == 3){
            findTwoMinNumbers(array);
        } else if (user.getChoice() == 4) {
            findSumMinMaxNumbers(array);
        } else if (user.getChoice() == 5) {
            startBubbleSort(array);
        }
    }

    private int[] activateArray(User user) {
        int[] array = new int[user.getNumber()];
        System.out.println("\nВот значения массива: ");
        for (int i = 0; i < user.getNumber(); i++) {
            array[i] = new Random().nextInt(201);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    private void sumEvenNumbers(int[] array) {
        int sum = 0;
        for (int value : array) {
            if ((value % 2) == 0) sum += value;
        }
        System.out.println("\nСумма его четных элементов равна " + sum);
    }

    private void findLessThenAverage(int[] array) {
        int average = findAverage(array);
        System.out.println("Вот значения, которые  меньше среднего значения по масиву с указанием номера ячейки: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average){
                System.out.print(array[i] +" [" + i + "] " );
            }
        }
    }

    private int findAverage(int[] array) {
        int sum = 0;
        for (int value : array) sum += value;
        System.out.println("\nВот среднее значение: " + sum / array.length + "\n");
        return sum / array.length;
    }

    private void findTwoMinNumbers(int[] array) {
        int min1 = array[0], min2 = array[1], index = 0;
        for (int i = 0; i <array.length ; i++) {
            if (min1 > array[i]) {
                min1 = array[i];
                index = i;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if ((i != index) && min2 > array[i]) {
                    min2 = array[i];
            }
        }
        System.out.println("\nВот два наименьших числа из массива: " + min1 + " и " + min2);
    }

    private void findSumMinMaxNumbers(int[] array) {
        int min = array[0], max = array[1];
        for (int value : array) {
            if (min > value) min = value;
            if (max < value) max = value;
        }
        System.out.println("\nВот наименьшее и наибольшее числа из массива: " + min + " и " + max);
    }

    private void startBubbleSort(int[] array) {
        boolean isFinish = false;
        int buff;
        while (!isFinish) {
            isFinish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isFinish = false;
                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }
        }
        System.out.println("\nВот отсортированный массив: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
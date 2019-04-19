package com.startjava.lesson_04.array_realtasks;

import java.util.Scanner;

public class ArrayTasksMain {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Эта программа работает с массивами,\n" +
                "она генерирует случайным образом значения его элелементов в диапазоне\n" +
                "от 0 до 200 и затем производит с ними различные операции:\n" +
                "1. Складывает сумму четных элеменов\n" +
                "2. Находит те значения, которые меньше среднего арифметического всего массива\n" +
                "3. Находит два наименьших значения\n" +
                "4. Находит сумму минимального и максимального значения массива\n" +
                "5. Производит сортировку по возрастанию методом пузырька.\n");

        String answer;
        do {
            System.out.print("\nВведите длину массива: ");
            user.setNumber(scanner.nextInt());
            System.out.print("\"Выберете желаемую операцию и введите её номер: ");
            user.setChoice(scanner.nextInt());
            ArrayTasks arrayTasks = new ArrayTasks(user);
            arrayTasks.startOperate(user);
            do {
                System.out.print("\nХотите пройти заново? [Y/N]: ");
                answer = scanner.next();
            } while (!answer.equals("Y") && !answer.equals("N"));
        } while (answer.equals("Y"));


    }
}

package com.startjava.lesson_04.array_realtasks;

import java.util.Scanner;

public class ArrayTasksMain {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        System.out.print("��� ��������� �������� � ���������,\n" +
                "��� ���������� ��������� ������� �������� ��� ����������� � ���������" +
                "�� 0 �� 200 � ����� ���������� � ���� ��������� ��������:\n" +
                "1. ���������� ����� ������ ��������\n" +
                "2. ������� �� ��������, ������� ������ �������� ��������������� ����� �������\n" +
                "3. ������� ��� ���������� ��������\n" +
                "4. ������� ����� ������������ � ������������� �������� �������\n");

        String answer;
        do {
            System.out.print("\n������� ����� �������: ");
            user.setNumber(scanner.nextInt());
            System.out.print("�������� �������� �������� � ������� � �����: ");
            user.setChoice(scanner.nextInt());
            ArrayTasks arrayTasks = new ArrayTasks(user);
            arrayTasks.startOperate(user);
            do {
                System.out.print("\n������ ������ ������? [Y/N]: ");
                answer = scanner.next();
            } while (!answer.equals("Y") && !answer.equals("N"));
        } while (answer.equals("Y"));


    }
}

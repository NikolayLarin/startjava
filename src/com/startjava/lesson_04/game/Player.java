package com.startjava.lesson_04.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int attemptNumber, int number) {
        this.numbers[attemptNumber - 1] = number;
    }

    public int getNumber(int attemptNumber) {
        return numbers[attemptNumber - 1];
    }

    public int[] getNumbers(int attemptNumber) {
        return Arrays.copyOf(numbers, attemptNumber);
    }

    public void setInitialConditions(int attemptNumber) {
        Arrays.fill(numbers, 0, attemptNumber - 1, 0);
    }
}

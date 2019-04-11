package com.startjava.lesson_04.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] number = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int attemptNumber, int number) {
        this.number[attemptNumber - 1] = number;
    }

    public int getNumber(int attemptNumber) {
        return number[attemptNumber - 1];
    }

    public int[] getCopyOfNumber(int attemptNumber) {
        return Arrays.copyOf(number, attemptNumber);
    }

    public void setInitialConditions(int attemptNumber) {
        Arrays.fill(this.number, 0, attemptNumber - 1, 0);
    }
}

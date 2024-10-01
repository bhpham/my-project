package com.coffee;

import java.util.Random;

public class DiceRoller {
    private int number = 0;
    private Random random;

    DiceRoller() {
        Random random = new Random();
        roll();
    }

    public void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}

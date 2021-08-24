package edu.wctc.dice.impl;

import edu.wctc.dice.iface.Dice;

import java.util.Random;

public class SixSidedDice implements Dice
{
    private int sides = 6;

    @Override
    public int getSides() {
        return sides;
    }

    @Override
    public int rollDice() {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }
}

package edu.wctc.dice.impl;

import edu.wctc.dice.iface.Dice;
import edu.wctc.dice.iface.DiceRoller;

import java.util.Random;

public class SingleNonDynamicRoller implements DiceRoller
{
    Dice dice = new SixSidedDice();

    @Override
    public int rollDie()
    {
        int sides = dice.getSides();
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }
}

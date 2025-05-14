package com.pluralsight;

import java.util.Random;

public class SuperVillian {

    public static void attack(Opponent opponent, int evilLevel) {
        Random random = new Random();
        int baseDamage = random.nextInt(11); // Generates a number from 0 to 10

        if (baseDamage == 0) {
            System.out.println("You missed! Your evil plans will have to wait...");
        } else {
            int totalDamage = baseDamage + evilLevel;
            opponent.health -= totalDamage;
            System.out.println("You kicked butt and dealt " + totalDamage + " damage to " + opponent.name + "! Evil prevails!");
        }
    }

}
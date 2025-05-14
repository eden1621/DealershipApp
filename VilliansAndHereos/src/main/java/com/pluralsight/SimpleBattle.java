package com.pluralsight;
import java.util.Random;

public class SimpleBattle {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();

        // Create the hero with a name, health, and power level
        String heroName = "Super Kid";
        int heroHealth = 100;
        int heroPower = 20;

        // Create the villain with a name, health, and evilness
        String villainName = "Evil Monster";
        int villainHealth = 100;
        int villainEvilness = 15;

        // Show the introduction message
        System.out.println(" Welcome to the Hero vs Villain Battle!");
        System.out.println("Our hero and villain are getting ready...\n");

        // Show starting status
        System.out.println("Hero: " + heroName);
        System.out.println("Health: " + heroHealth);
        System.out.println("Power Level: " + heroPower);
        System.out.println();

        System.out.println("Villain: " + villainName);
        System.out.println("Health: " + villainHealth);
        System.out.println("Evilness: " + villainEvilness);
        System.out.println();

        // Loop while both are alive
        while (heroHealth > 0 && villainHealth > 0) {
            // Hero's turn
            System.out.println(" " + heroName + "'s turn to attack!");
            int heroAttack = random.nextInt(heroPower);
            villainHealth = villainHealth - heroAttack;
            if (villainHealth < 0) villainHealth = 0;
            System.out.println(heroName + " hits " + villainName + " for " + heroAttack + " damage.");
            System.out.println(villainName + "'s health is now: " + villainHealth + "\n");

            // Check if villain is still alive
            if (villainHealth <= 0) {
                break; // stop the battle
            }

            // Villain's turn
            System.out.println(" " + villainName + " turn to attack!");
            int villainAttack = random.nextInt(villainEvilness);
            heroHealth = heroHealth - villainAttack;
            if (heroHealth < 0) heroHealth = 0;
            System.out.println(villainName + " hits " + heroName + " for " + villainAttack + " damage.");
            System.out.println(heroName + " health is now: " + heroHealth + "\n");
        }

    }
}


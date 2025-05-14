package com.pluralsight;

public class Villain {
        // Villain has a name, health, and evilness
        String name;
        int health;
        int evilness;

        // This is how we create a villain
        public Villain(String name, int health, int evilness) {
            this.name = name;
            this.health = health;
            this.evilness = evilness;
        }

        // Show villain's details
        public void showVillainInfo() {
            System.out.println("Villain Name: " + name);
            System.out.println("Villain Health: " + health);
            System.out.println("Villain Evilness: " + evilness);
        }


        public static void main(String[] args) {
            // Let's make a villain!
            Villain myVillain = new Villain("Doctor Doom", 100, 40);

            // Show villain's info
            myVillain.showVillainInfo();
        }
    }




package com.pluralsight;
import java.util.Random;

//create a class using the extends keyword to bascially copy all the functionality from
//the parent class to the child class
public class SuperHero extends SuperPerson{

    //constructor that calls the parent class constructor
    public SuperHero(String name, int health, int powerLevel) {
        super(name, health);

        //in the parent we default power level (XP) to 0
        //for our superhero we want to have them pass in power level
        //but just use that as xp
        this.experiencePoints = powerLevel;

        //let the world know the hero now exists
        System.out.println(this.name + " has arrived with a power level of " + powerLevel);
    }

    @Override
    public void fight(SuperPerson opponent){
        //make the hero do a random amount of damage to the opponenet
        //the damage should be a random numnber plus the experiencesPoints(powerLevel)
        //if the base damage (without the xp) was 0, don't do any damage and just say you missed
        //otherwise deal the damage and say something about you kicking butt agains your opponent
    }


}
        public static void main(String[] args) {
            String opponent = "Eden";
            int experiencePoints = 5; // Power level
            Random rand = new Random();

            int baseDamage = rand.nextInt(6); // Random number from 0 to 5
            int totalDamage;

            if (baseDamage == 0) {
                System.out.println("You swing and miss your attack on the " + opponent + "!");
            } else {
                totalDamage = baseDamage + experiencePoints;
                System.out.println("You deal " + totalDamage + " damage to the " + opponent + "!");
                System.out.println("You're kicking butt out there!");
            }

        }


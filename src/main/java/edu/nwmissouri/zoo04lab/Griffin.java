package edu.nwmissouri.zoo04lab;

import java.util.Scanner;

enum NumberParity {
    EVEN,
    ODD
}

/**
 * The class Griffin, a subclass of Animal
 *
 * @author Alexander Dieringer
 */
public class Griffin extends Animal {

    /**
     * Define variables to hold data about the Griffin class May refactor
     * variables into super class To be used in additional methods added later
     */
    private final String species_name;
    private final String species_latin;
    private final String locationFound;
    private final int sleepDuration_hours;
    private final int movementSpeed_mph;
    private final boolean isExtinct;

    /**
     * Griffin constructor Creates an instance of the Griffin class, requires a
     * name
     *
     * @param name The name we will be giving our new Griffin
     */
    public Griffin(String name) {
        super(name);

        this.species_name = "Griffin";
        this.species_latin = "grȳpus";
        this.locationFound = "Fantasy";
        this.sleepDuration_hours = 8;
        this.movementSpeed_mph = 80;
        this.isExtinct = true;
    }

    /**
     * *****************************
     * SUPERCLASS FUNCTION OVERRIDES
     ******
     */
    /**
     * speak() - Presents the types of sounds made by the Griffin
     */
    @Override
    public void speak() {
        System.out.println("I'm a Griffin and I chirp like a bird, but I can "
                + "trumpet loudly if angry.");
    }

    /**
     * move() - Describes the general type of movement the animal Griffin
     */
    @Override
    public void move() {
        System.out.println("I can walk but I really enjoy flying through the sky.");
    }

    /**
     * *****************************
     * GRIFFIN UNIQUE FUNCTIONS
    ******
     */
    /**
     * getMyName() - Returns the animal's name
     *
     * @return The name of the animal as a String
     */
    public String getMyName() {
        return this.name;
    }

    /**
     * getSpeciesName() - Returns the animal's species
     *
     * @return The animal's species as a String
     */
    public String getSpeciesName() {
        return this.species_name;
    }

    /**
     * getLatinName() - Returns the animal's Latin name
     *
     * @return The animal's Latin name as a String
     */
    public String getLatinName() {
        return this.species_latin;
    }

    /**
     * getLocationFound() - Return the location the animal is found
     *
     * @return The location of the animal as a String
     */
    public String getLocationFound() {
        return this.locationFound;
    }

    /**
     * getSleepDuration() - Return how long the animal sleeps
     *
     * @return The length the animal sleeps in hours
     */
    public int getSleepDuration() {
        return this.sleepDuration_hours;
    }

    /**
     * getMovementSpeed() - Returns the max movement speed of the animal
     *
     * @return How fast the animal can move in mph
     */
    public int getMovementSpeed() {
        return this.movementSpeed_mph;
    }

    /**
     * getIsExtinct() - Returns whether the animal is extinct or not
     *
     * @return Returns true or false on whether the animal is extinct
     */
    public boolean getIsExtinct() {
        return this.isExtinct;
    }

    /**
     * calculateSumParity() - Calculates the parity of a 2 number sum
     *
     * @param num1 The first integer to add up
     * @param num2 The second integer to add up
     * @return The NumberParity enumerator holding ODD or EVEN
     */
    public static NumberParity calculateSumParity(int num1, int num2) {
        double sum = num1 + num2;
        double calc = sum;
        System.out.println("Adding (" + num1 + " plus " + num2 + ") to get: " + sum);

        boolean isEven = false;
        while (calc >= 2) {
            calc = (calc / 2);
        }
        isEven = (calc == 1.0);

        // Some testing code we commented out for now
        /*
        String testText = (isEven) ? "EVEN" : "ODD";
        System.out.println("Debug: Sum is " + sum 
        + ", which we think is " + testText + " because calc = " + calc);
         */
        return (isEven) ? NumberParity.EVEN : NumberParity.ODD;
    }

    public static void main(String[] args) {
        var g = new Griffin("Tester");

        String myName = g.getName();
        System.out.println("Hello, my name is : " + myName + "!");

        g.speak();
        g.move();

        String mySpecies = g.getSpeciesName();
        System.out.println("\nMy species is called " + mySpecies);

        String myLatin = g.getLatinName();
        System.out.println("Sometimes I'm referred to as the species: " + myLatin);

        String myLocation = g.getLocationFound();
        System.out.println("My preferred habit is: " + myLocation);

        int mySleep = g.getSleepDuration();
        System.out.println("When I get tired I like to sleep for " + mySleep + " hours");

        int myMovespeed = g.getMovementSpeed();
        System.out.println("When I'm really speeding along I max out at "
                + myMovespeed + " mph");

        String isFound = (g.getIsExtinct()) ? "yes" : "no";
        System.out.println("Can you find me out in the wild? The answer is "
                + isFound);

        int firstNumber, secondNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDid you know Griffin's are really good at math too?");
        System.out.println(" - Give the griffin a number");
        firstNumber = scan.nextInt();
        System.out.println(" - Give the griffin a second number");
        secondNumber = scan.nextInt();

        NumberParity result = calculateSumParity(firstNumber, secondNumber);
        if (result == NumberParity.EVEN) {
            System.out.println(myName + " says that the sum of your numbers is EVEN!");
        } else if (result == NumberParity.ODD) {
            System.out.println(myName + " says that the sum of your numbers is ODD");
        } else {
            System.out.println(myName + " is a little confused, maybe he's feeling sick");
        }
    }
}

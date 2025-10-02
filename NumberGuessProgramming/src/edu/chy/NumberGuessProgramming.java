package edu.chy;

// author: Chris Young

import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;

public class NumberGuessProgramming {

    public static void main(String[] args)
    // write your code here
    {
        //Initialize the variables
        int tries = 0; // Maximum number of tries
        boolean done = false;
        boolean valid = false;
        int Guess = 10;
        int Count = 0;

        //Input Scanner, Random number generator, and Number formatter
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randNumber = generator.nextInt(100) + 1;


        // Show how many tries you have and guess a number between 1 and 100
        System.out.println("You have 10 tries to guess a number between 1 and 100");

// if I've used up 10 guesses or guessed the random number the loop stops.

        while (!done) {

            valid = false;
            do {
                // Get and validate a guess
                Count = Count + 1;
                System.out.printf("Enter Guess %d: ", Count); // Guess what the random number is.
                Guess = in.nextInt();

                if (Guess < 1 || Guess > 100) {
                    System.out.println("Guesses should be between 1 and 100");
                }
                if (Guess >= 1 && Guess <= 100) {
                    valid = true;
                }
            }
            while (!valid);
            //Logic to process guess

            tries = tries + 1;
            if (Guess > randNumber) {
                System.out.println("Your guess is too high. Try again."); //
            }
            else if (Guess < randNumber) {
                System.out.println("Your guess is too low. Try again.");
            }
            if (Guess == randNumber) {
                System.out.printf("Congratulations! You have correctly guessed the number in %d tries. ", tries);
            }
            if (tries == 10) {
                System.out.printf("Sorry, you did not guess the number in 10 tries. The number is %d", randNumber);
                {break;}
            }
            if (Guess == randNumber) {
                valid = true;
                Count = Count + 1;
                {break;}
            }
        }
    }
}





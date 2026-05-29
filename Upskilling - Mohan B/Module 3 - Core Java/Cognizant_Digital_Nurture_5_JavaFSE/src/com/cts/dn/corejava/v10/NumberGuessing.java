package com.cts.dn.corejava.v10;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
       
        int cg = random.nextInt(100) + 1; //cg stands for computer guessing 
        int userGuess = 0;
        
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

     
        while (userGuess != cg) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess < cg) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > cg) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You got it.");
            }
        }
        
        sc.close();
    }
}

/*
Victoria Barkley
CS232-002
Number Guessing Game
Lab #3
This program chooses a secret number and prompts 
the user to guess the secret number. If they do not 
guess correctly, the program will say whether their 
guess is too high or too low. Once the player guesses 
the number, the program will output a congratulatory 
message.
September 12th, 2021
 */

import java.util.Scanner;

public class Number_Guessing_Game {
     public static void main(String[] args)    {
         Scanner input = new Scanner(System.in);
         
         // variable declarations
         int secret_num = (int) (Math.random()*100) + 1;
         int guess;
         int num_guesses = 0;
         int guesses_left = 14;
         boolean incorrect = true;
         boolean win = false;
         
         System.out.println("I'm thinking of a number between 1 and 100 ...");
         System.out.println("You have 15 chances to correctly guess the number.");
         
         // Input and Processing phase
         while (incorrect && num_guesses < 15){
             
                System.out.print("Please guess a number: ");
                guess = input.nextInt();
            
                if (guess > secret_num) {
                    System.out.println(guess + " is too high.");
                    System.out.println("You have " + guesses_left + " guess(es) left.");
                    guesses_left--;
                }
                else if (guess < secret_num) {
                    System.out.println(guess + " is too low.");
                    System.out.println("You have " + guesses_left + " guess(es) left.");
                    guesses_left--;
                }
                else if (guess == secret_num) {
                    incorrect = false;
                    win = true;
                }
                
                num_guesses++;
            }
         
         // Outputting phase
         if (win == true){
             System.out.println("Congratulations! You guessed the number in " + num_guesses + " guess(es)!");
         }
         else if (num_guesses == 15) {
             System.out.println("Sorry! You didn't guess the correct number in 15 guesses.");
             System.out.println("The correct number was " + secret_num + ". Please try again!");
         }
     }
}
package Coding_playground.Java_labs;

import java.util.Scanner;

public class DiceGame {
   
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        //Programmet frågar spelaren om antal omgångar, tärningens sidor och spelarens namn.
        System.out.println("Welcome to THE DICEGAME!");
        System.out.println("How many rounds would you like to play?");
        
        int rounds = sc.nextInt();

        System.out.println("How many sides to your die?");

        int playerSides = sc.nextInt();
        sc.nextLine(); //this line eats the "new line", so the program won't ignore userName input.

        System.out.println("Last question! What should I call you?");

        String userName = sc.nextLine();

        System.out.println("Okay, " + userName + "! Let's play THE DICEGAME!");
        
        //programmet skapar spelaren och hens tärning.
        Player playerOne = new Player(userName);
        playerOne.addDie(playerSides);
       
        //Här börjar for-loopen som är själva spelet.
        for (int i=0; i < rounds; i++) {
            
            System.out.println("Please guess your next roll!");
            
            int guess = sc.nextInt();
            sc.nextLine();//same shit
            
            System.out.println("Press enter to roll your die!");
    
            sc.nextLine();

            playerOne.rollDice();

            int currentValue=playerOne.getDieValue();
            
            System.out.println("You rolled a "+ currentValue);

            if (guess==currentValue) {
                playerOne.increaseScore();
                System.out.println("Congratulations, you guessed it right! Your score is now "+ playerOne.getScore());
            }
            else {
                System.out.println("Sorry, your guess was wrong. Better luck next time!");
            }
        }
        
        int finalScore=playerOne.getScore();
        if (finalScore==0) {
            System.out.println("Unfortunately, your final score is zero.");
        }
        else {
            System.out.println(finalScore +" is your final score. Well done you!");
        }
        
        System.out.println("Thank you for playing THE DICEGAME!");
    }  
         
}  
    
    
    
    
    


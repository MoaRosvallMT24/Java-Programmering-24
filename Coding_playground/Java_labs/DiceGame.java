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

        int number = sc.nextInt();
        sc.nextLine(); //this line eats the "new line", so the program won't ignore userName input.

        System.out.println("Last question! What should I call you?");

        String userName = sc.nextLine();

        System.out.println("Okay, " + userName + "! Let's play THE DICEGAME!");
    }
    
    

    //spelaren gissar värdet
    //spelaren slår tärningen
    //ge spelaren en poäng om gissning == värde

    //skriv ut spelarens slutpoäng
    
}

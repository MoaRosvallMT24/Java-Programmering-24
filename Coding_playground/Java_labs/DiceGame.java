package Coding_playground.Java_labs;

import java.util.Scanner;

public class DiceGame {
    public Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to THE DICEGAME!");
        System.out.println("How many rounds would you like to play?");
        
        int rounds = sc.nextInt();

        System.out.println("How many sides to your die?");

        int sides = sc.nextInt();

        System.out.println("Last question! What should I call you?");

        String userName = sc.nextLine();

        System.out.println("Okay, " + userName + "! Let's play THE DICEGAME!");
    }
    
    

    //spelaren gissar värdet
    //spelaren slår tärningen
    //ge spelaren en poäng om gissning == värde

    //skriv ut spelarens slutpoäng
    
}

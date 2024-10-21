package Coding_playground.Java_exercises.Arrays;
import java.util.Arrays;
public class Exercise5 {
    public static void main(String[] args) {
        String[] fruits = new String[4];
        
        fruits[0]="apple";
        fruits[1]="banana";
        fruits[2]="orange";
        fruits[3]="grape";

        System.out.println(fruits.length);

        fruits[1]="pear";

        String[] moreFruits = new String[6]; 
        moreFruits = copyOf(fruits, 6);

    }
}

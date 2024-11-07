package Coding_playground.Java_exercises.Arrays;
import java.util.Arrays;
public class Exercise51 {
    public static void main(String[] args) {
        
        String[] fruits = new String[4];
        
        fruits[0]="apple";
        fruits[1]="banana";
        fruits[2]="orange";
        fruits[3]="grape";

        System.out.println(fruits.length);

        fruits[1]="pear";

        System.out.println(fruits[1]);

        String[] moreFruits = Arrays.copyOf(fruits, 6);
         
        moreFruits[4]=("cumquat");
        moreFruits[5]=("mango");

        for (int i=0;i<moreFruits.length;i++) {
            System.out.println(moreFruits[i]);
        }
        
        String[] lessFruits = Arrays.copyOf(fruits, 2);

        for (int i=0;i<lessFruits.length;i++) {
            System.out.println(lessFruits[i]);
        }
        



    

    }
}

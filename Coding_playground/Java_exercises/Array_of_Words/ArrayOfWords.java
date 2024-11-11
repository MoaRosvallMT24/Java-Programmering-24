package Coding_playground.Java_exercises.Array_of_Words;
import java.util.Arrays;

public class ArrayOfWords {
    public static void main(String[] args) {
        
        String[] myWordArray = new String[7];

        myWordArray[0] = "coincidence";
        myWordArray[1] = "neck";
        myWordArray[2] = "forecast";
        myWordArray[3] = "faint";
        myWordArray[4] = "paint";
        myWordArray[5] = "discrimination";
        myWordArray[6] = "athlete";

        int longestWord = 0;
        int longestWordIndex = 0;

        for (int i=0; i<myWordArray.length; i++){
            
            if (myWordArray[i].length() > longestWord){
                longestWord = myWordArray[i].length();
                longestWordIndex = i;
            }
        }

        System.out.println("The longest word is " +myWordArray[longestWordIndex]+ " with a total of " +longestWord+ " letters!");
        
        Arrays.sort(myWordArray);

        System.out.println("Here's a look at our words in alphabetical order:");
        for (int i=0; i<myWordArray.length; i++){
            System.out.println(myWordArray[i]);
        }


        
        //find the longest word
        //använd length
        //loopa igenom orden för att hitta det längsta

        //count the number of letters in each word
        //använd length

        //sort the array in alphabetical order

        //count number of vowels in each word


    }
}

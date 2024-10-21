package Coding_playground.Java_exercises;

public class myMathMethods {

    public int calculateFactorial(int input){
        int factorial=0;
        for(int i=1; i <= input; i++){
            factorial=input*(input-i);            
        }
        return factorial;
    }    
}

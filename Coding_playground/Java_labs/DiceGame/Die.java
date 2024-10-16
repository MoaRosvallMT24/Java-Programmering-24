package Coding_playground.Java_labs.DiceGame;
import java.util.Random;
public class Die {

    private int sides;
    private int value;
    private Random rand;
    
    public Die(int sides){
        this.sides = sides;
        this.value = 1;
        this.rand = new Random();
    }

    public int getSides(){
        return sides;
    }

    public int getValue(){
        return value;
    }

    public void roll(){
        int rollValue=rand.nextInt(sides);
        value=rollValue+1;
    }
        
}

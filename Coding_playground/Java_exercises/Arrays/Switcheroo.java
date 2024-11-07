import java.util.Random;

public class Switcheroo {
    
    private Random rand;
    private int[] randomNumbers;

    public int[] getRandomNumbers() {
        return randomNumbers;
    }

    public Switcheroo(){
        this.rand = new Random();
        this.randomNumbers = new int[rand.nextInt(2,10)];
        
        for (int i=0;i<randomNumbers.length;i++){
            randomNumbers[i]=rand.nextInt(20);
        }
    }
    

    

    public void swapNumbers() {
        int x = randomNumbers[0];
        randomNumbers[0]=randomNumbers[1];
        randomNumbers[1]=x;
    }

    public void chaosMultiply(int chaos) {
        randomNumbers[chaos]=randomNumbers[chaos]*randomNumbers[chaos];
    }

    public void printRandomNumbers(){
        for (int i=0; i<randomNumbers.length;i++) {
            System.out.println(randomNumbers[i]);

        }
    }




}

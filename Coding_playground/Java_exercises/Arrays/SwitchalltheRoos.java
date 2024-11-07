import java.util.Random;
public class SwitchalltheRoos {
    
    
    
    public static void main(String[] args) {
        
        Switcheroo chaosParty = new Switcheroo();

        chaosParty.getRandomNumbers();

        chaosParty.printRandomNumbers();
        
        System.out.println("\n Switcheroo! \n");
        
        chaosParty.swapNumbers();

        chaosParty.printRandomNumbers();
        
        Random randy = new Random();

        int pop = randy.nextInt(chaosParty.getRandomNumbers().length-1);
        
        System.out.println("\n Chaos power of "+pop+"! \n");

        chaosParty.chaosMultiply(pop);

        chaosParty.printRandomNumbers();
    }
}

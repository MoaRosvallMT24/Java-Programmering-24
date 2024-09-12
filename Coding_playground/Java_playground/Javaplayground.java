public class Javaplayground {
    public static void main(String[] args) {

        int number = 0;
        int sum = 0;

       for (int i = 0; i <= 20; i++) {
        if (number % 2 != 0) {
            sum = sum + number;      
        }
        number++; 
       }

       System.out.println("The sum of the first 10 odd numbers is " + sum);
        
       }
            
    }
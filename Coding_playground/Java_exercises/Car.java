package Coding_playground.Java_exercises;



public class Car {
    
    String make;
    String model;
    int year;
    String color;

    
  

    public Car(String make, String model, String color){
        this(make, model, 0, color);
    }

    public Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public static void main(String[] args){
       
        Car redDanger = new Car("Toyota", "Rav4", "red");
        Car silverBullit = new Car("Volkswagen", "Golf", 2008, "silver" );

        
        System.out.println(silverBullit.make);
        System.out.println(silverBullit.model);
        System.out.println(silverBullit.year);
        System.out.println(silverBullit.color);
        System.out.println();
        System.out.println(redDanger.make);
        System.out.println(redDanger.model);
        System.out.println(redDanger.year);
        System.out.println(redDanger.color);
        System.out.println();
    }
}

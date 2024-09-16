package Coding_playground.Java_exercises;

public class Book {

    String title;
    String author;
    int year;

    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;

    }

    public static void main(String[] args){
        Book drivingMissDaisy = new Book("Driving Miss Daisy", "Brilliant Person", 1956);
            

        System.out.println(drivingMissDaisy);
        System.out.println(drivingMissDaisy.title);
        System.out.println(drivingMissDaisy.author);
        System.out.println(drivingMissDaisy.year);

    }

    
}

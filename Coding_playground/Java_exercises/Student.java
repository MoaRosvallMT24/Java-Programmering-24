package Coding_playground.Java_exercises;

public class Student {
    
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public static void main(String[] args) {

        Student helmer = new Student("Helmer", 17, 4.2);

        System.out.println(helmer.name);
        System.out.println(helmer.age);
        System.out.println(helmer.grade);
        System.out.println();
    }
}

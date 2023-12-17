import java.util.Scanner;

public class Student {

    // Member variables
    private String name;
    private int age;
    private int marks;
    private String stream;

    // Constructor
    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.stream = ""; // Initially set stream to empty string
    }

    // Method to accept input
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = sc.nextLine();
        System.out.println("Enter student age: ");
        age = sc.nextInt();
        System.out.println("Enter student marks: ");
        marks = sc.nextInt();
    }

    // Method to allocate stream based on marks
    public void allocateStream() {
        if (marks >= 300) {
            stream = "Science and Computer";
        } else if (marks >= 200 && marks < 300) {
            stream = "Commerce and Computer";
        } else if (marks >= 75 && marks < 200) {
            stream = "Arts and Animation";
        } else {
            stream = "Try Again";
        }
    }

    // Method to print student information
    public void print() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Marks: " + marks);
        System.out.println("Student Stream: " + stream);
    }

    // Main method
    public static void main(String[] args) {
        Student student = new Student("", 0, 0); // Create a student object
        student.accept(); // Accept input from user
        student.allocateStream(); // Allocate stream based on marks
        student.print(); // Print student information
    }
}

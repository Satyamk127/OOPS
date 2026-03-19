public class Student {

    String name;
    int age;
    int rollNo;

    // Constructor overloading means having multiple constructors
    // in the same class with different parameter lists.
    Student() {
        name = "Unknown";
        age = 0;
        rollNo = 0;
    }

    Student(String name) {
        this.name = name;
        this.age = 0;
        this.rollNo = 0;
    }

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println();
    }
}

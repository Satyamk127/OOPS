public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("ram");
        Student s3 = new Student("Shyam", 20, 101);

        System.out.println("Default constructor:");
        s1.display();

        System.out.println("One-parameter constructor:");
        s2.display();

        System.out.println("Three-parameter constructor:");
        s3.display();
    }
}

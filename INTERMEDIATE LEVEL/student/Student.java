package student;

public class Student {
    public String name;
    public int roll;

    public Student(String n, int r) {
        name = n;
        roll = r;
    }

    public void displayStudent() {
        System.out.println("----- Student Details -----");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll);
    }
}

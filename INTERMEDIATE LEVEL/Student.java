// Ques 11
class Student {
    String name;
    int age;
    Student() {
        name = "Ajay";
        age = 20;
    }
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul", 22);
        s1.display();
        s2.display();
    }
}

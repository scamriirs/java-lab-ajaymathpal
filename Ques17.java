interface Marks {
    void display();
}
class Student implements Marks {
    String name;
    int m1, m2, m3;
    Student(String n, int a, int b, int c) {
        name = n; m1 = a; m2 = b; m3 = c;
    }
    public void display() {
        int total = m1 + m2 + m3;
        double per = total / 3.0;
        System.out.println(name + " " + total + " " + per);
    }
    public static void main(String[] args) {
        Student s = new Student("Ajay", 85, 90, 88);
        s.display();
    }
}

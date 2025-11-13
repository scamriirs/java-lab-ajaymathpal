package exam;
import student.Student;
public class Result extends Student {
    int m1, m2, m3;
    public Result(String n, int r, int a, int b, int c) {
        super(n, r); m1 = a; m2 = b; m3 = c;
    }
    public void display() {
        int total = m1 + m2 + m3;
        double per = total / 3.0;
        System.out.println(name + " " + roll + " " + per);
    }
}

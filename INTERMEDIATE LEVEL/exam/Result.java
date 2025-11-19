package exam;

import student.Student;

public class Result extends Student {
    public int m1, m2, m3;

    public Result(String n, int r, int a, int b, int c) {
        super(n, r);
        m1 = a;
        m2 = b;
        m3 = c;
    }

    public void generateMarksheet() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        displayStudent();
        System.out.println("----- Marks Obtained -----");
        System.out.println("Subject 1 : " + m1);
        System.out.println("Subject 2 : " + m2);
        System.out.println("Subject 3 : " + m3);
        System.out.println("--------------------------");
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage + "%");
    }
}

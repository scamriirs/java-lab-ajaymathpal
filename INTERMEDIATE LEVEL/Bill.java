import java.util.*;
class Customer {
    String name;
    int units;
    Customer(String n, int u) {
        name = n;
        units = u;
    }
}
class Bill extends Customer {
    double amount;
    Bill(String n, int u) {
        super(n, u);
    }
    void calculate() {
        if(units <= 100) amount = units * 1.20;
        else if(units <= 300) amount = 100 * 1.20 + (units - 100) * 2;
        else amount = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
    }
    void display() {
        System.out.println(name + " " + amount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int u = sc.nextInt();
        Bill b = new Bill(n, u);
        b.calculate();
        b.display();
    }
}

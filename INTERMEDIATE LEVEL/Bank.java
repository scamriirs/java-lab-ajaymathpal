import java.util.*;
class Account {
    int accNo;
    double balance;
    Account(int a, double b) {
        accNo = a;
        balance = b;
    }
    void checkBalance() {
        System.out.println(balance);
    }
}
class Savings extends Account {
    double interestRate;
    Savings(int a, double b, double i) {
        super(a, b);
        interestRate = i;
    }
    void deposit(double amt) {
        balance += amt;
    }
    void withdraw(double amt) {
        if(balance >= amt) balance -= amt;
    }
}
class Current extends Account {
    double overdraftLimit;
    Current(int a, double b, double o) {
        super(a, b);
        overdraftLimit = o;
    }
    void withdraw(double amt) {
        if(balance + overdraftLimit >= amt) balance -= amt;
    }
}
class Bank {
    public static void main(String[] args) {
        Savings s = new Savings(101, 5000, 5);
        s.deposit(1000);
        s.withdraw(2000);
        s.checkBalance();
        Current c = new Current(102, 3000, 2000);
        c.withdraw(4000);
        c.checkBalance();
    }
}

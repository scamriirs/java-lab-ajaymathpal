// Ques 14
// import java.util.*;

class Account {
    int accNo;
    double balance;

    Account(int a, double b) {
        accNo = a;
        balance = b;
    }

    void checkBalance() {
        System.out.println("Account No: " + accNo);
        System.out.println("Current Balance: " + balance);
    }
}

class Savings extends Account {
    double interestRate;

    Savings(int a, double b, double i) {
        super(a, b);
        interestRate = i;
    }

    void deposit(double amt) {
        System.out.println("Depositing " + amt + " into Savings Account " + accNo);
        balance += amt;
    }

    void withdraw(double amt) {
        if (balance >= amt) {
            System.out.println("Withdrawing " + amt + " from Savings Account " + accNo);
            balance -= amt;
        } else {
            System.out.println("Insufficient Balance in Savings Account " + accNo);
        }
    }
}

class Current extends Account {
    double overdraftLimit;

    Current(int a, double b, double o) {
        super(a, b);
        overdraftLimit = o;
    }

    void withdraw(double amt) {
        if (balance + overdraftLimit >= amt) {
            System.out.println("Withdrawing " + amt + " from Current Account " + accNo);
            balance -= amt;
        } else {
            System.out.println("Overdraft Limit Exceeded for Current Account " + accNo);
        }
    }
}

class Bank {
    public static void main(String[] args) {

        System.out.println("-- Savings Account Operations --");
        Savings s = new Savings(101, 5000, 5);
        s.deposit(1000);
        s.withdraw(2000);
        s.checkBalance();

        System.out.println("\n-- Current Account Operations --");
        Current c = new Current(102, 3000, 2000);
        c.withdraw(4000);
        c.checkBalance();
    }
}

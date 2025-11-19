import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r, s = 0, t = n;
        while(n > 0) {
            r = n % 10;
            s = s * 10 + r;
            n /= 10;
        }
        if(t == s)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}

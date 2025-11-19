import java.util.*;
class HCF {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println(a);
        sc.close();
    }
}

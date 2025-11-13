import java.util.*;
class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        while(n > 0) {
            s = (n % 2) + s;
            n /= 2;
        }
        System.out.println(s);
    }
}

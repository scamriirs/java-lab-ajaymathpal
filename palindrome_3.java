import java.util.Scanner;

public class palindrome_3 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int reversed=0;
        while (num!=0) {
        int remainder=num%10;
        reversed=reversed*10+remainder;
        num=num/10;
        }
        if(reversed==original){
            System.out.println(original+" is palindrome");
        }
        else{
            System.out.println(original+" is not palindrome");
        }
        sc.close();
    }
    
}

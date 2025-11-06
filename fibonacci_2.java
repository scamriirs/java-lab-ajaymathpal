import java.util.Scanner;

public class fibonacci_2 {

    public static void main(String[] args){
        
        System.out.println("enter number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fib1=0;
        int fib2=1;
        int fibo=0;
        if(num==0){
            fibo=fib1;
        }
        else if(num==1){
            fibo=fib2;
        }
        else {
            for(int i=2;i<=num;i++){
            fibo=fib1+fib2;
            fib1=fib2;
            fib2=fibo;
        }
    }
        System.out.println(fibo);
        sc.close();
    }
}

import java.util.Scanner;
public class factorial_1 {

    public static void main(String[] args){
        System.out.println("Enter data");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        if(num==0){
            System.out.println("Factorial -> 1");
        }
        else if(num==1){
            System.out.println("Factorial -> 1");
        }
        else{
            for(int i=2;i<=num;i++){
                fact=fact*i;
            }
            System.out.println("Factorial -> "+fact);
        }
        sc.close();
    }
}

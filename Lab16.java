import java.util.*;
public class Lab16 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to check whether its prime or not");
        int n=sc.nextInt();
        boolean flag=isPrime(n);
        System.out.println(flag);
    }

    public static boolean isPrime(int n){
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                break;
           }
           else
           return true;
        }
        return false;
    }
}

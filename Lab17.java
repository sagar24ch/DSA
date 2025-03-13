import java.util.Scanner;
public class Lab17 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no tocheck whether the no is prime or not");
        int n=sc.nextInt();
        boolean flag=isPrime(n);
        System.out.println(flag);
    }

    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
    return true;
        
    }
}

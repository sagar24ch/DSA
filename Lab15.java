import java.util.Scanner;
public class Lab15{

    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to check whether prime or not");
        int n=sc.nextInt();
        boolean flag=isPrime(n);
        System.out.println(flag);
    }

    public static boolean isPrime(int n){
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        else
        return false;
    }

}

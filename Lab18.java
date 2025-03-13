import java.util.*;
public class Lab18 {

//prime nos upto 1 to n
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
       System.out.println("-------------------");
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        
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

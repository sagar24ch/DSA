import java.util.*;
public class Lab31 {                                //cheking nois strong no or not
                                                    //strong no is if the sum of the factorial of each digits of a no is equals to the actual no
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to check");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        if(isStrong(i))
            System.out.println(i);
        }
    }
    public static long factorial(int n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static boolean isStrong(int n){
        int  nCopy=n;
        long sum=0; 
        while(n!=0)
        {
            int digit =n%10;
            long fact=factorial(digit);
            //sum=sum+fact;
            sum+=fact;
            n=n/10;
        }
            return(sum==nCopy);
    }
}

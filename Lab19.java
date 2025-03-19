import java.util.*;
public class Lab19 {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(isPerfect(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int n){
      int sum=0;
        for(int i=1;i<=n/2;i++){
        if(n%i==0){
            sum=sum+i;
        }
      }  
      if(sum==n)
      return true;
      else
      return false;
    }
}

import java.util.*;
public class Lab13 {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();

        // printing the divisibles of a no
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0){
                System.out.println(i);
            }
           // System.out.println(n);
        }
    }
}

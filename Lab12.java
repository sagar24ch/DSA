import java.util.*;
public class Lab12 {
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%6==0){
                System.out.println(i);
            }
        }
    }
}

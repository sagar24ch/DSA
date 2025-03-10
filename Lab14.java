import java.util.*;
public class Lab14 {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        int count=2;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0){
                count++;
            }
        }
        System.out.println("count="+count);
    }
}

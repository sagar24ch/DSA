import java.util.*;
public class Lab32 {
    public static void main(String as[]) {              //reverse of a no
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println(rev);
        while(rev!=0){
            int d=rev%10;
            System.out.print(d);
            rev=rev/10;
        }
    }           
}
//time complexity=O(d+d)=O(d)
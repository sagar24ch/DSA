//sum of individual digits of a no....Ex-123=3+2+1=6
public class Lab60 {
        static int digitSum(int n){
            if(n==0)
            return 0;

            return n%10+digitSum(n/10);
        }
    public static void main(String as[]){
        int result=digitSum(12345);
        System.out.println(result);
    }
}

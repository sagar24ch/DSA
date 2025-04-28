public class Lab58 {
    static int numSum(int n){
        //int sum=0;
        if(n==0)
        return 0;

        return n+numSum(n-1);
    }
    public static void main(String as[]){
        int result=numSum(10);
        System.out.println(result);
    }
}

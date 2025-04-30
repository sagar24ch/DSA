//kth element of fibonacci series
//print fibbonaci series 0 1 1 2 3 5 8 13 21.....
public class Lab61 {
    static int fibbo(int n){
       if(n<=1)
       return n;

       return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String as[]){
       int n=fibbo(8);
       System.out.println(n);
}
}

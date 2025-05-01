public class Lab62 {
    static int fibonacci(int n){
    
        if(n<=1)
        return 1;

        int a=0;
        int b=1;
        int c=a+b;
        return a +fibonacci(n-1);
        
    }
    public static void main(String as[]){
        int result=fibonacci(5);
        System.out.println(result);
    }
}

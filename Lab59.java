public class Lab59 {
    static int fact(int n){
        if(n==0 || n==1)
        return 1;
        
        return n*fact(n-1);
    }
    public static void main(String as[]){
        int facto=fact(5);
        System.out.println(facto);
    }
}

public class Lab47 {
    
    public static class Hello{
    int fact(int n){
        if(n==0 || n==1)
            return 1;
        
            return n*fact(n-1);
        
    }
}
public static void main(String as[]){
    Hello h=new Hello();
    int facto=h.fact(5);
    System.out.println(facto);
}
}

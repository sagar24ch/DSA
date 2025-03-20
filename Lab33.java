public class Lab33 {                    //fibonacii series
    public static void main(String as[]){
        int n=10;
        int a=0;
        int b=1;
        System.out.print(a+"\t"+b);
        for(int i=1;i<=n-2;i++){
            int c=a+b;
            System.out.print("\t"+c);
           a=b;
           b=c;
        }
    }
}

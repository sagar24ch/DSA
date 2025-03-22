public class Lab36 {            //Evaluate 1+2/x+3/x2+4/x3+5/x4
    public static void main(String as[]){
        int n=4;
        int x=2;
        double result=0.0;
        for(int i=1;i<=n;i++){
            result=result+(i/power(x,i-1));
        }
        System.out.println(result);
    }
    public static double power(double x,double p){
        double result=1;
        for(int i=1;i<=p;i++){
            result=result*x;
        }
        return result;
    }
}

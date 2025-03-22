public class Lab37 {
                   //evaluate 1-2/x+3/x2-4/x3+5/x4-6/x5.....
    public static double power(double x,double p){
        double result=1;
        for(int i=1;i<=p;i++)
        {
            result=result*x;
        }
        return result;
    }
    public static void main(String as[]){
        int n=4;
        int x=2;
        double result=0;
        int sign=1;
        for(int i=1;i<=n;i++)
        {
            result=result+(sign)*(i/power(x,i-1));
            sign=sign*-1;
        }
        System.out.println(result);
    }
}

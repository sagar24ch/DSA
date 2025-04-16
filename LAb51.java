public class LAb51 {
    public static void main(String as[]){
        int n=11;
        int rNum=revNum(n);
        System.out.println(rNum);
    }
    public static int revNum(int n){
        int rev=0;
        while(n!=0){
            rev=rev*2;
            if((n&1)==1){
                rev=rev+1;
            }
            n=n/2;
        }
        return rev;
    }
}

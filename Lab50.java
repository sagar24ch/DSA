public class Lab50 {
    public static int reverseBit(int n){
        int rev=0;
        for(int i=1;i<=4;i++){
            rev=rev<<1;
            if((n&1)>0){
                rev=rev+1;
            }
            n=n>>1;
        }
        return rev;
    }
    public static void main(String as[]){
        int num=11;
        int rNum=reverseBit(num);
        System.out.println(rNum);
    }
}

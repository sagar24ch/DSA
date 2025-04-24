public class Leetcode693 {
    public static void main(String as[]){
        boolean b=checkAlternateBit(7);
        System.out.println(b);
    }
    public static boolean checkAlternateBit(int n){
        int pBit=n&1;
        n=n>>1;
        while(n>0){
        int cBit=n&1;
        if(pBit==cBit)
            return false;

            pBit=cBit;
            n=n>>1;
    }
        return true;
    }
}

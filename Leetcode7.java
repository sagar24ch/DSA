public class Leetcode7 {
    public static void main(String as[]){
        int x=3456;
        boolean flag=isSum(x);
        System.out.println(flag);
    }
    public static boolean isprime(int x){
       
      for(int i=1;i<=x/2;i++){
        if(x%i==0){
            sum=sum+i;
        }
      }
      return sum==x;
    }
    }


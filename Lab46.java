public class Lab46 {
    
    public static void main(String as[]){
        int n=25;
        int count=0;

        while(n>0)
        if((n&1)==1)
        count++;
        System.out.println("no of set bits="+count);
    }
}

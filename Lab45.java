public class Lab45 {
    //count the set bits
    public static void main(String as[]){
       int n=25;
       int count=0;
       while(n>0)
       
        if((n&1)==1)
        {
        count++;
        }
       System.out.println("set bits="+count);
    }
}
 

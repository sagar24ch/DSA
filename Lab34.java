public class Lab34 {                //printing series 1,1,6,4,11,9,16,16,21,25
    public static void main(String as[]){
        int n=5;
        int a=1;
        int b=1;
        
        for(int i=1;i<=n;i++){
           
            System.out.print(a+"\t");
            a=a+5;
            b=i+i;
            System.out.print(b+"\t");
        }
    }
    
}

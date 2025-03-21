import java.util.*;
public class Lab35 {            //printing 0,1,3,8,6,27,9,64,12,125 
    public static void main(String as[]){
        int n=5;
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+"\t");
            a=a+3;
            b=i*i*i;
            System.out.print(b+"\t");
        }
    }
}

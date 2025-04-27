public class Lab56 {
     static void show(int n){
        //1.Base condition
        if(n==0)
        return;

        //2.Your logic(here to print only) 
        System.out.println(n);

        //3.recursive call
        show(n-1);
     }
    public static void main(String as[]){
        show(5);
    }
}

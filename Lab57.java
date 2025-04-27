//printing 1 to n (non tail recursive)

public class Lab57 {
    static void show(int n){
        if(n==0)
        return;

        show(n-1);
        System.out.println(n);
    }
    public static void main(String as[]){
        show(5);
    }
}

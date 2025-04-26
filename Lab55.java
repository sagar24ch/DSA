
class Hello{
    void m1(){
        System.out.println("m1 begin");
        m2();
        int b=20;
        System.out.println("b="+b);
        System.out.println("m1() end");
    }
    void m2(){
        System.out.println("m2 begin");
        int c=30;
        System.out.println("c="+c);
        System.out.println("m2() end");
    }
}
public class Lab55 {
    public static void main(String as[]){
        System.out.println("main() begin");
        Hello h=new Hello();
        h.m1();
        int a=10;
        System.out.println(a);
        System.out.println("main() end");
    }
    
}

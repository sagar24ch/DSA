public class Lab43 {                //XOR operation  ^
                                    //if both same=false otherwise true  0^0=0,0^1=1,1^0=0,1^1=0
    
        public static void main(String as[]){
            int a=12;
            int b=13;
            int c=23;
            int result=a^b;
            int result2=b^c;
            System.out.println(result);
            System.out.println(result2);

            boolean d=true;
            boolean e=false;
            boolean f=true;
            System.out.println(d^f);
            System.out.println(d^e);
        }
                                }

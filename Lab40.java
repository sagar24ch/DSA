public class Lab40 {
    public static void main(String as[]){
        int row=5;
        int star=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=star;j++){
                System.out.print(" * ");
            }
            System.out.println("");
            star=star+1;
             }
            //same patter in reverse
        for(int i=1;i<=row;i++){
            for(int j=1;j<=star;j++){
                System.out.print(" * ");
            }
            System.out.println("");
            star=star-2;
        }
    }
}

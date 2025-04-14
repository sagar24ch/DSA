public class BrainKerningamAlgo {
    public static void main(String as[]){
        int n=25;
        int counter=0;

        while(n>0){
       n=n&n-1;
       counter++;
    }
}
    System.out.println(counter);
}

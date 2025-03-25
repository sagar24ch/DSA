public class Lab41 
   {
    public static void main(String as[]){
        int num=1;
        boolean flag=powerOfThree(num);
        System.out.println(flag);
    }
    public static boolean powerOfThree(int num){
        
        while(num%3)

        powerOfThree(num);






      /*if(num==0)
        return false;
        if(num==1)
        return true;

        if(num%3!=0)
        return false;

        while(num%3==0){
            num=num/3;
        }
        return num==1;*/
    }
   }
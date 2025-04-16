//finding single no
public class Lab52 {
    public static void main(String as[]){
        int arr[]={2,4,6,5,5,6,4,7,2};
        int num=singleNum(arr);
        System.out.println(num);
    }
    public static int singleNum(int arr[]){
          int result=0;
          for(int i=0;i<arr.length;i++){
            result^=arr[i];
          }
          return result; 
}
}

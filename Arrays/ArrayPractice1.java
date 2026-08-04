package Arrays;
import java.util.Scanner;
public class ArrayPractice1 {
    public static int LinerSearch(int arr[],int key){
        //for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return arr[i];
            }
            
       // }
        return -1;
             }
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[]arr =new int[5];
    for(int i=0;i<arr.length;i++){
    arr[i] = sc.nextInt();
    }
    int key=sc.nextInt();
   int result = LinerSearch(arr,key);
   if (result==-1){
    System.out.print("Key not found");
   }
   else{
    System.out.println("key found  " + result);
   }
 }   
}

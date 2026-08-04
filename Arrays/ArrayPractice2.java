package Arrays;
import java.util.Scanner;
public class ArrayPractice2 {
    
        //Method to read Array
   public static void readArray(int[] arr, Scanner sc){
    for(int index=0; index<arr.length;index++){
        arr[index]=sc.nextInt();
    }

   }
   //Method to Count Positive and Negative Number
   public static void CountPandN(int []arr){
    int positive=0;
    int negative=0;
    for(int index=0; index<arr.length; index++){
        if(arr[index]<0){
            negative++;
        }
        else{
            positive++;
        }
    }
    System.out.println("Positive count " + positive );
     System.out.println("Negative count " + negative );
    }
    // Main method
 public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int[] arr = new int[6];
        readArray(arr,sc);
           CountPandN(arr);        
    }
    }

    


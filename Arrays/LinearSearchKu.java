package Arrays;
import java.util.Scanner;
public class LinearSearchKu {

    //Method to Read array
    public static void ReadArray(int[]arr,Scanner sc){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    //Method to Lenear Search
    public static int LinearSearch(int[]arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void startProgram() {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];

    ReadArray(arr, sc);

    int target = sc.nextInt();

    int result = LinearSearch(arr, target);

    System.out.println(result);
}
public static void  read2darray(int [][]arr,Scanner sc){
    for(int row=0; row<arr.length; row++){
       for(int col=0; col<arr[row].length; col++){
         arr[row][col]=sc.nextInt();
       }
    }
}
//Method to Linear search in 2D array()
public static int linearSearchin2dArray(int [][]arr,int target){
    for(int row=0; row<arr.length; row++){
        for(int col=0;col<arr[row].length;col++){
         if(arr[row][col]==target){
            return row * arr[row].length + col;
         }
        }
    }
    return -1;
}
public static void invokeLinear2dArray(){
    Scanner sc =new Scanner(System.in);
    int target=sc.nextInt();
    int [][] arr = new int[3][3];
     read2darray(arr,sc);    
   int result= linearSearchin2dArray(arr,target);
   System.out.print(result);
}


    public static void main(String[] args){
       invokeLinear2dArray();
}
}
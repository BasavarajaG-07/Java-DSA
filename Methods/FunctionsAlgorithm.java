package Methods;
import java.util.Scanner;

public class FunctionsAlgorithm {
//function to add two values
    public static int getSumofNumber(int num1,int num2){
        return num1+num2;
    }
    //invoke sum
    public static void invoketheSum(){
       Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum = getSumofNumber(num1 , num2);
        System.out.println(sum);

    }

    //functin to swap two number
    public static void swapNumbers(int num1,int num2){
      int temp=num1;
          num1=num2;
          num2 = temp;
          System.out.println("After Swapping:");
        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);
    
    }
    //Method to print swapnumbers
    public static void invokeSwapNumber(){
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        swapNumbers( num1, num2);
        
    }

  public static boolean NumberisEven(int num){
    if(num % 2==0){
        System.out.print("number is even");
        return true;
    }
    else{
        System.out.print("number is odd");
        return false;
    }
  }
  public static void invokeisEvennum(){
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    NumberisEven(num);
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

// Function to print ASCII values

public static String readString(Scanner sc) {
        return sc.nextLine();
}
public static void asciiValue(String str ){
   
    for(int index=0; index<str.length(); index++){
         char ch=str.charAt(index);
         int asci = ch;
         System.out.println(ch + " = " + asci);

    }
    
}
//Function to count vowels given string
public static String getString( Scanner sc){
    return sc.nextLine();
}
public static int countofvowels(String str){
    int count=0;
    for(int i=0; i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
    }
    return count;
}
public static void invokeVowels(){
    Scanner sc = new Scanner(System.in);
         String str =getString(sc);
         int result=countofvowels(str);
            System.out.print(result); 
}

//Method to reverse String

//method to get string from user
public static String getString(Scanner sc){
    return sc.nextLine();
}
public static String reverseString(String str){
    String reverse="";
    for(int i=str.length()-1; i>=0;i--){
      reverse=reverse+ str.charAt(i);
    }
    return reverse;
}
public static void invokeReverseString(){
    Scanner sc = new Scanner(System.in);
   String str= getString(sc);
    String result=reverseString(str);
    System.out.print(result);
}
public static void readArray(int [] arr ,)
    public static void main(String[] args){
        
    }
    
}

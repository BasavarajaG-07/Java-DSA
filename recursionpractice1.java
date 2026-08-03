import java.util.Scanner;
public class recursionpractice1 {
    public static int RecursionFun(int n){
        if(n==0){
            return 0;
        }
        n=n-1;
        RecursionFun(n);
        return n;
        
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int result = RecursionFun(n);
    System.out.println(result);

} 
    
}

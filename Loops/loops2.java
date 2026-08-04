package Loops;
import java.util.Scanner;
public class loops2 {
    public static void Printpyramid(int gsize)
    {
        
        for(int row=1; row<=gsize; row++){
            for(int col=1; col<=row; col++)
                {
                  System.out.print("* ");  
                }
          System.out.println(" ");
    }
    
}
    
    public static void main(String[] args ){
    Scanner sc= new Scanner(System.in);
    int gsize=sc.nextInt();
    Printpyramid(gsize);
    }
}
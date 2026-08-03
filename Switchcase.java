import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        char op;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next().charAt(0);


         switch(op) {
             
            case '+':
                System.out.println("Addition = " + (a+b));
                break;
            case '-':
                System.out.println("Substraction" + (a-b)); 
                break;
            case '*':
                System.out.println("Multiplication" +(a*b));
                break;
            case '/':
                System.out.println("Division"+(a/b));   

         }
    }
    
}

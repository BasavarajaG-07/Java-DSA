import java.util.*;
public class countUppercaseandlowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int lower=0;
        int upper = 0;

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>='A'&&c<='Z'){
               upper++;
            }
            else if(c>='a'&&c<='z'){
                lower++;
               
            }

        }
        System.out.println("lowe"+lower);
        System.out.println("upper"+upper);
    }
    
}

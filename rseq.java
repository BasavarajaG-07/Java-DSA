import java.util.Scanner;

public class rseq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i += 2) {

            char ch = str.charAt(i);          // Alphabet
            int count = str.charAt(i + 1) - '0'; // Convert digit to integer

            for (int j = 0; j < count; j++) {
                System.out.print(ch);
            }
        }
    }
}
    


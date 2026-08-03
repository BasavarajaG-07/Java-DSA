 import java.util.Scanner;

public class FindingFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            // Count frequency
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            // Check if already printed
            boolean printed = false;

            for (int k = 0; k < i; k++) {
                if (ch == str.charAt(k)) {
                    printed = true;
                    break;
                }
            }

            if (!printed) {
                System.out.println(ch + " = " + count);
            }
        }
    }
}
    


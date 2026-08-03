import java.util.Scanner;
public class AscitoString {
    // Function to print ASCII values
    public static void printAscii(String st) {

        for(int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            int ascii = ch;

            System.out.println(ch + " = " + ascii);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Function calling
        printAscii(str);
    }
}
    


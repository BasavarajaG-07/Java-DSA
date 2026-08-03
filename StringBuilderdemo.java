import java.util.Scanner;

public class StringBuilderdemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();


        sc.nextLine();

        for(int i=0; i<N; i++)
        {
            String word = sc.nextLine();

            sb.append(word);
        }

        System.out.println(sb.toString());
    }
}
    


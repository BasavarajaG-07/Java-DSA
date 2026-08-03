import java.util.Scanner;

public class Strtoarr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] strarr = input.split("-");

        int largest = 0;

        for(String str : strarr)
        {
            int num = Integer.parseInt(str);

            if(num > largest)
            {
                largest = num;
            }
        }

        System.out.println(largest);
    }
}
    


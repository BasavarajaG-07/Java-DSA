import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        int position = 0;

        while(position < 5) {
            numbers[position] = sc.nextInt();
            position++;
        }

        int largestNumber = 0;

        largestNumber = numbers[0];

        for(int positionValue = 1; positionValue < numbers.length; positionValue++)
        {
            if(numbers[positionValue] > largestNumber)
            {
                largestNumber = numbers[positionValue];
            }
        }

        System.out.println(largestNumber);
    }
}
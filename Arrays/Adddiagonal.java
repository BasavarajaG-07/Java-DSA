package Arrays;
public class Adddiagonal {
    
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 1}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum =sum+ matrix[i][i];
        }

        System.out.println("Diagonal Sum = " + sum);
    }
}
    


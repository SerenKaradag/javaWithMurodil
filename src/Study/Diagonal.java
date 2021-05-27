package Study;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result = 0;

        int leftToRightSum = 0;
        int rightToLeftSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            leftToRightSum += matrix[i][i];}
        for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++) {
            rightToLeftSum += matrix[i][j];}
        result = leftToRightSum - rightToLeftSum;
    }
}

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read r and c
        if (!sc.hasNextInt()) return;
        int r = sc.nextInt();
        int c = sc.nextInt();

        // TODO: Read the matrix elements
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // TODO: Print the elements in spiral order
        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;

        while (top <= bottom && left <= right) {
            // 1. Traverse Left to Right along the top boundary
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Move top boundary down

            // 2. Traverse Top to Bottom along the right boundary
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move right boundary left

            // 3. Traverse Right to Left along the bottom boundary
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move bottom boundary up
            }

            // 4. Traverse Bottom to Top along the left boundary
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move left boundary right
            }
        }
        
        sc.close();
    }
}

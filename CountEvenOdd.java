package array;


import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        // Read number of rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Create 2D array
        int[][] arr = new int[rows][cols];

        // Read array elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Counters for even and odd
        int even = 0;
        int odd = 0;

        // Check each element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        // Print result
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
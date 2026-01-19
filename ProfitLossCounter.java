package arrayLogic_Assignment_1D;


import java.util.Scanner;

public class ProfitLossCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value :");
        // Read number of elements
        int n = sc.nextInt();
        int[] arr = new int[6];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize counters
        int positive = 0, negative = 0, zero = 0;

        // Count values
        for (int value : arr) {
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        // Output results
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
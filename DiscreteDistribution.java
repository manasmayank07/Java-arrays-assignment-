// Part 1 of arrays.zip Assignment
// File: DiscreteDistribution.java
// Topic: Weighted probability index selection using arrays

import java.util.Scanner;

public class DiscreteDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of values
        int[] freq = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            freq[i] = scanner.nextInt();
            total += freq[i];
        }

        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + freq[i - 1];
        }

        int r = (int)(Math.random() * total);
        for (int i = 0; i < n; i++) {
            if (r >= sum[i] && r < sum[i + 1]) {
                System.out.println(i);
                break;
            }
        }
    }
}

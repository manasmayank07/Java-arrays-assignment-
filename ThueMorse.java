// Part 2 of arrays.zip Assignment
// File: ThueMorse.java
// Topic: Binary pattern generation (Thue–Morse sequence) using arrays

import java.util.Scanner;

public class ThueMorse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // length of sequence
        int[] sequence = new int[n];

        for (int i = 1; i < n; i++) {
            sequence[i] = 1 - sequence[i / 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}

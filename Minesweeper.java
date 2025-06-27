// Part 4 of arrays.zip Assignment
// File: Minesweeper.java
// Topic: 2D Minesweeper board creation using arrays

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();   // number of rows
        int cols = scanner.nextInt();   // number of columns
        int mines = scanner.nextInt();  // number of mines

        char[][] board = new char[rows][cols];

        // Initialize board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '.';
            }
        }

        // Place mines randomly
        Random rand = new Random();
        int count = 0;
        while (count < mines) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);
            if (board[r][c] != '*') {
                board[r][c] = '*';
                count++;
            }
        }

        // Print the board
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

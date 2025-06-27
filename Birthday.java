// Part 3 of arrays.zip Assignment
// File: Birthday.java
// Topic: Birthday paradox simulation using boolean arrays

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();      // number of people in the room
        int trials = scanner.nextInt();      // number of simulations
        int count = 0;

        for (int t = 0; t < trials; t++) {
            boolean[] hasBirthday = new boolean[365];
            boolean found = false;

            for (int i = 0; i < people; i++) {
                int day = (int)(Math.random() * 365);
                if (hasBirthday[day]) {
                    count++;
                    found = true;
                    break;
                }
                hasBirthday[day] = true;
            }
        }

        System.out.println("Estimated probability: " + (double)count / trials);
    }
}

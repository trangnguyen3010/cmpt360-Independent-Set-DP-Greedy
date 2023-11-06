package main;

import java.util.Scanner;

public class IndependentSet {
    public static int findIndependentSetMaxWeight(Path path) {
        return 0;
    }

    public static void main(String[] args) {
        // Write code to read the standard input
        // and print the output.
        Scanner scanner = new Scanner(System.in);
        int N = getNextInt(scanner);

        // Read the next N lines, each line contains one
        Path path = new Path();
        for (int i = 0; i < N; i++) {
            int x = getNextInt(scanner);
            path.addVertex(x);
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }
        System.out.println(path);
    }

    private static int getNextInt(final Scanner scanner) {
        if (scanner.hasNextInt()) {
            int number =  scanner.nextInt();
            verifyBiggerThanZero(number);
            return number;
        } else {
            throw new IllegalArgumentException("Expected a integer! But got: " + scanner.next() + "!");
        }
    }

    private static void verifyBiggerThanZero(final double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Expected a number at least 0! But got: " + number + "!");
        }
    }
}

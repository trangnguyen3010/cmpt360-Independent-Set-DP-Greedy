package main;

import java.util.Scanner;

public class IndependentSet {
    public static int findIndependentSetMaxWeight(Path path) {
        int[] memoi = new int[path.getSize() + 2];
        memoi[0] = 0;
        memoi[1] = 0;
        for (int i = 2; i < path.getSize() + 2; i++) {
            int currentVertex = path.getVertex(i - 2);
            memoi[i] = Math.max(memoi[i - 1], memoi[i - 2] + currentVertex);
        }
        return memoi[path.getSize() + 1];
    }

    public static String findIndependentSetMaxWeightPath(Path path) {
        int[] memoi = new int[path.getSize() + 2];
        memoi[0] = 0;
        memoi[1] = 0;
        StringBuilder onePreviousSet = new StringBuilder();
        StringBuilder twoPreviousSet = new StringBuilder();
        for (int i = 2; i < path.getSize() + 2; i++) {
            int currentVertex = path.getVertex(i - 2);
            memoi[i] = Math.max(memoi[i - 1], memoi[i - 2] + currentVertex);

            if (memoi[i - 1] > memoi[i - 2] + currentVertex) {
                onePreviousSet.append(".").append(" ");
                twoPreviousSet = new StringBuilder().append(onePreviousSet);
            } else {
                twoPreviousSet.append(currentVertex).append(" ");
                onePreviousSet.append(".").append(" ");
            }

            StringBuilder temp = onePreviousSet;
            onePreviousSet = twoPreviousSet;
            twoPreviousSet = temp;
        }

        if (onePreviousSet.substring(onePreviousSet.length() - 2).equals(". ")) {
            twoPreviousSet.append("= ");
            twoPreviousSet.append(memoi[path.getSize() + 1]);
            return twoPreviousSet.toString();
        } else {
            onePreviousSet.append("= ");
            onePreviousSet.append(memoi[path.getSize() + 1]);
            return onePreviousSet.toString();
        }
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
        System.out.println(findIndependentSetMaxWeightPath(path));
    }

    private static int getNextInt(final Scanner scanner) {
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
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

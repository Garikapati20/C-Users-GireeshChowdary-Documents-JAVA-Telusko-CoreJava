package org.example;

public class FibonacciNumber {

    public void printFibonacciSeries(int m, int n, int count) {
        if (count < 2) {
            System.out.println("The count must be at least 2.");
            return;
        }

        System.out.print(m + " " + n + " ");
        for (int i = 2; i < count; i++) {
            int sum = calculateNextFibonacci(m, n);
            m = n;
            n = sum;
            System.out.print(sum + " ");
        }
    }

    private int calculateNextFibonacci(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        int first = 0;
        int second = 1;
        int count = 12; // Number of Fibonacci numbers to print
        fibonacciNumber.printFibonacciSeries(first, second, count);
    }
}

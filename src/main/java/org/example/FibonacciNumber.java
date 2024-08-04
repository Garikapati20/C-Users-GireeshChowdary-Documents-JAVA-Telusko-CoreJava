package org.example;

public class FibonacciNumber {

    // Removed redundant variables and added a method for calculating Fibonacci number
    public void calculateFibonacci(int m, int n) {
        System.out.print(m + " " + n + " ");
        for (int i = 0; i < 10; i++) {

            int sum = m + n;
            m = n;
            n = sum;

            System.out.print(sum + " ");
        }
    }
}

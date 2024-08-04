package org.example;

public class FibonacciNumber {

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

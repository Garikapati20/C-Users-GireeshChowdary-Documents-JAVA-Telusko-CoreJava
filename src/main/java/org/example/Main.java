package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 4;
        int rows = 5;  // You can change this to the number of rows you want

        for (int i = 1; i <= rows; i++) {  // Outer loop for rows
            // Inner loop for spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print("  ");  // Two spaces for better alignment
            }
            // Inner loop for stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line after each row
        }

    }
}
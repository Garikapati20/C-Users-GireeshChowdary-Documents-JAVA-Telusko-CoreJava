package org.example;

public class PalindromeNumber {
    void checkPalindrome(int n) {
        int temp, sum, rem;
        sum =0;
        temp = n;
        while(temp>0){
            rem = temp%10;
            sum = (sum *10) + rem;
            temp = temp /10;
        }
        if(sum == n){
            System.out.println("Is a palindrome" + sum+ " " + n);
        }
        else{
            System.out.println("not a palindrome"+ sum + " " + n);
        }
    }
}



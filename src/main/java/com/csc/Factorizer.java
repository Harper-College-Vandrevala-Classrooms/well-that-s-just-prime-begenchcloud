package com.csc;

import java.util.Scanner;

public class Factorizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Factorizer!!!");
        System.out.println("Enter the number to be factorized: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Prime factors of " + n + " are: ");
        System.out.println(factorize(n));

        System.out.println("Is the number prime? " + isPrime(n));
    }

    public static String factorize(int n) {
        StringBuilder factors = new StringBuilder();

        if (n < 2) {
            return "null";
        }

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                factors.append(i).append(" ");
            }
        }
        if (n != 1) {
            factors.append(n);
        }

        return factors.toString().trim();
    }

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 13 || n == 17 || n == 19 || n == 23 ||
                n == 29 || n == 31 || n == 37 || n == 41 || n == 43 || n == 47 || n == 53 || n == 59 ||
                n == 61 || n == 67 || n == 71 || n == 73 || n == 79 || n == 83 || n == 89 || n == 97) {
            return true;
        }
        return false;
    }
}

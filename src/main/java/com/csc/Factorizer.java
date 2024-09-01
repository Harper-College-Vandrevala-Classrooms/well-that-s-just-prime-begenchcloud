package com.csc;

import java.util.Scanner;

public class Factorizer {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the Factorizer!!!");
    System.out.println("Enter the number to be factorized: ");
    int n = sc.nextInt();

    System.out.println("Prime factors of " + n + " are: ");
    factorize(n);

  }

  public static String factorize(int n) {
    StringBuilder factors = new StringBuilder();

    if (n < 2)
    {
      return "null";
    }

    for (int i = 2; i < n; i++) {
      while (n % i == 0) {
        n = n / i;
        factors.append(i);
      }
    }
    if (n != 1) {
      factors.append(n);
    }

    return factors.toString();
  }
}

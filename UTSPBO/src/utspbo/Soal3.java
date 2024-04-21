/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

import java.util.Scanner;

public class Soal3 {

  public static int reverse(int number) {
    int reversedNumber = 0;
    while (number > 0) {
      int digit = number % 10;
      reversedNumber = reversedNumber * 10 + digit;
      number /= 10;
    }
    return reversedNumber;
  }

  public static boolean isPalindrome(int number) {
    return number == reverse(number);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan 3 bilangan integer: ");
    int number = scanner.nextInt();

    if (isPalindrome(number)) {
      System.out.println(number + " adalah palindrom");
    } else {
      System.out.println(number + " bukan palindrom");
    }

    scanner.close();
  }
}

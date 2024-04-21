/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

import java.util.Scanner;

public class Soal1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan bilangan integer tiga digit: ");
    int angka = scanner.nextInt();

    if (angka < 100 || angka > 999) {
      System.out.println("harus terdiri 3 angka integer");
    } else {
      if (adalahPalindrom(angka)) {
        System.out.println(angka + " adalah palindrom");
      } else {
        System.out.println(angka + " bukan palindrom");
      }
    }
    scanner.close();
  }

  public static boolean adalahPalindrom(int angka) {
    int angkaAwal = angka;
    int angkaTerbalik = 0;

    while (angka > 0) {
      int digit = angka % 10;
      angkaTerbalik = angkaTerbalik * 10 + digit;
      angka /= 10;
    }
    return angkaAwal == angkaTerbalik;
  }
}

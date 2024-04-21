/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author admin
 */
public class Soal2_Pattern3 {

  public static void main(String[] args) {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6 - i; j++) {
        System.out.print(" "); 
      }
      for (int k = i; k >= 1; k--) {
        System.out.print(k);
      }
      System.out.println(); 
    }
  }
}

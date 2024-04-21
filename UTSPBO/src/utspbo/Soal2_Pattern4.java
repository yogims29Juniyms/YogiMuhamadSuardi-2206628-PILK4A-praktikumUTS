/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author admin
 */
public class Soal2_Pattern4 {

  public static void main(String[] args) {
    for (int i = 6; i >= 1; i--) {
      for (int j = 6 - i; j >= 1; j--) {
        System.out.print(" "); 
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(k);
      }
      System.out.println(); 
    }
  }
}

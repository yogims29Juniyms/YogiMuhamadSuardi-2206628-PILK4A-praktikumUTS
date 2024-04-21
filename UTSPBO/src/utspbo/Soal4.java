/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

public class Soal4 {
    public static void main(String[] args) {
        // Balok 1
        Balok balok1 = new Balok(1, 1, 1);
        System.out.println("\nBalok 1:");
        balok1.cetakInformasi();

        // Balok 2
        Balok balok2 = new Balok(30, 40, 50);
        System.out.println("\nBalok 2:");
        balok2.cetakInformasi();

        // Balok 3
        Balok balok3 = new Balok(25, 35, 45);
        System.out.println("\nBalok 3:");
        balok3.cetakInformasi();
    }
}

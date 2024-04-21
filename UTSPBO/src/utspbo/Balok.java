/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok() {
        this.panjang = 1;
        this.lebar = 1;
        this.tinggi = 1;
    }

    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }

    public int getLuas() {
        int luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        return luasPermukaan;
    }

    public int getKeliling() {
        int keliling = 4 * (panjang + lebar + tinggi);
        return keliling;
    }

    public int getVolume() {
        int volume = panjang * lebar * tinggi;
        return volume;
    }

    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    public void setTinggi(int tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public void cetakInformasi() {
        System.out.println("Balok dengan panjang: " + panjang + ", lebar: " + lebar + " dan tinggi: " + tinggi + ". Luasnya: " + getLuas() + ", sedangkan kelilingnya: " + getKeliling() + " dan volumenya: " + getVolume());
    }
}

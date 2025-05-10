/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_uts;

/**
 *
 * @author INSTIKI
 */
public class Penjualan {
   
    String kodeBarang;
    String namaBarang;
    int jumlah;
    double harga;

    public Penjualan(String kodeBarang, String namaBarang, int jumlah, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void tampilkan() {
        System.out.println("Kode: " + kodeBarang + ", Nama: " + namaBarang + ", Jumlah: " + jumlah + ", Harga: " + harga);
    }
}



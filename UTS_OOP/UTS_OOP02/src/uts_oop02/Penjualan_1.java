/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_oop02;

/**
 *
 * @author INSTIKI
 */
public class Penjualan {
    private String kodeBarang;
    private String namaBarang;
    private int jumlah;
    private double harga;

    // Constructor untuk Penjualan
    public Penjualan(String kodeBarang, String namaBarang, int jumlah, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi barang
    public void tampilkan() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
    }

    // Menghitung total harga barang
    public double totalHarga() {
        return jumlah * harga;
    }

    // Override toString untuk representasi string
    @Override
    public String toString() {
        return "Penjualan { Kode: " + kodeBarang + ", Nama: " + namaBarang + ", Jumlah: " + jumlah + ", Harga: " + harga + " }";
    }
}

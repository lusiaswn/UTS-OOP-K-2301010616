/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_oop02;

/**
 *
 * @author INSTIKI
 */
import java.util.ArrayList;
public class transaksi {
  
  public class Transaksi {
    private String kodeTransaksi;
    private String tanggal;
    private ArrayList<Penjualan> daftarPenjualan;
    private double totalTransaksi;

    // Constructor tanpa parameter
    public Transaksi() {
        this.kodeTransaksi = "";
        this.tanggal = "";
        this.daftarPenjualan = new ArrayList<>();
        this.totalTransaksi = 0.0;
    }

    // Constructor dengan parameter
    public Transaksi(String kodeTransaksi, String tanggal) {
        this.kodeTransaksi = kodeTransaksi;
        this.tanggal = tanggal;
        this.daftarPenjualan = new ArrayList<>();
        this.totalTransaksi = 0.0;
    }

    // Menambah penjualan ke transaksi
    public void tambahPenjualan(Penjualan p) {
        daftarPenjualan.add(p);
        totalTransaksi += p.totalHarga();  // Update total transaksi
    }

    // Menghitung total transaksi
    public double hitungTotal() {
        return totalTransaksi;
    }

    // Override toString untuk representasi transaksi
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kode Transaksi: ").append(kodeTransaksi)
          .append(", Tanggal: ").append(tanggal)
          .append("\nDaftar Penjualan:\n");

        for (Penjualan p : daftarPenjualan) {
            sb.append(p.toString()).append("\n");
        }

        sb.append("Total Transaksi: ").append(hitungTotal());
        return sb.toString();
    }
} 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_uts;

/**
 *
 * @author INSTIKI
 */

import java.util.Scanner; // ← WAJIB ADA
public class OOP_UTS {

    /**
     * @param args the command line arguments
     */
  

    static Penjualan[] data = new Penjualan[100];
    static int totalData = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MENU PENJUALAN ===");
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); // Buang newline

            switch (pilihan) {
                case 1: inputData(); break;
                case 2: tampilkanData(); break;
                case 3: ubahData(); break;
                case 4: hapusData(); break;
                case 5: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    static void inputData() {
        System.out.print("Masukkan kode barang: ");
        String kode = input.nextLine();
        System.out.print("Masukkan nama barang: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jumlah: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan harga: ");
        double harga = input.nextDouble();
        input.nextLine(); // Buang newline

        data[totalData] = new Penjualan(kode, nama, jumlah, harga);
        totalData++;
        System.out.println("Data berhasil ditambahkan!");
    }

    static void tampilkanData() {
        if (totalData == 0) {
            System.out.println("Belum ada data.");
            return;
        }
        System.out.println("\n=== DAFTAR PENJUALAN ===");
        for (int i = 0; i < totalData; i++) {
            System.out.print((i + 1) + ". ");
            data[i].tampilkan();
        }
    }

    static void ubahData() {
        tampilkanData();
        if (totalData == 0) return;

        System.out.print("Masukkan nomor data yang ingin diubah: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index < 0 || index >= totalData) {
            System.out.println("Nomor tidak valid!");
            return;
        }

        System.out.print("Masukkan kode barang baru: ");
        String kode = input.nextLine();
        System.out.print("Masukkan nama barang baru: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jumlah baru: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan harga baru: ");
        double harga = input.nextDouble();
        input.nextLine();

        data[index] = new Penjualan(kode, nama, jumlah, harga);
        System.out.println("Data berhasil diubah!");
    }

    static void hapusData() {
        tampilkanData();
        if (totalData == 0) return;

        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index < 0 || index >= totalData) {
            System.out.println("Nomor tidak valid!");
            return;
        }

        for (int i = index; i < totalData - 1; i++) {
            data[i] = data[i + 1];
        }
        totalData--;
        System.out.println("Data berhasil dihapus!");
    }
}



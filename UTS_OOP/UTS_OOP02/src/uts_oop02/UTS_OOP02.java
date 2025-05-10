/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_oop02;

/**
 *
 * @author INSTIKI
 */

import java.util.Scanner;
public class UTS_OOP02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner input = new Scanner(System.in);

        // Membuat objek Transaksi
        Transaksi transaksi = new Transaksi("T001", "2025-05-10");

        // Menambahkan data penjualan
        Penjualan p1 = new Penjualan("B001", "Laptop", 2, 5000000);
        Penjualan p2 = new Penjualan("B002", "Mouse", 3, 150000);

        transaksi.tambahPenjualan(p1);
        transaksi.tambahPenjualan(p2);

        // Menampilkan detail transaksi
        System.out.println(transaksi.toString());
    }
}
    
    


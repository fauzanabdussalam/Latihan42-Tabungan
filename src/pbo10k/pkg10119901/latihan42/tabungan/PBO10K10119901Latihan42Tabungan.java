/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan42.tabungan;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menampilkan perhitungan Volume dan Massa Jenis Kubus
 *
 */
public class PBO10K10119901Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan t      = new Tabungan();
        Scanner scanner = new Scanner(System.in);
        
        int saldo, jumlah;
        
        System.out.println("====Program Penarikan Uang====");
        
        System.out.print("Masukkan Saldo Awal \t : ");
        saldo = scanner.nextInt();
        t.tabungan(saldo);
        
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = scanner.nextInt();
        
        System.out.println("Saldo Anda Sekarang \t : " + t.ambilUang(jumlah));
    }
    
}

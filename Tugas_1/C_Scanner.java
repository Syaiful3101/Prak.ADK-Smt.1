/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packages;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class C_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nik, nama, tmplahir, tgllahir, alamat;
        int usia;
        String jKel;
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan_NIK = ");
        nik = in.nextLine();
        System.out.print("Masukkan_Nama = ");
        nama = in.nextLine();
        System.out.print("Masukkan_Tempat_Lahir = ");
        tmplahir = in.nextLine();
        System.out.print("Masukkan_Tanggal_Lahir = ");
        tgllahir = in.nextLine();
        System.out.print("Masukkan_Alamat = ");
        alamat = in.nextLine();
        System.out.print("Masukkan_Usia = ");
        usia = in.nextInt();
        System.out.print("Masukkan_Jenis_Kelamin [L/P] = ");
        jKel = in.next();
        System.out.println("identitas_Pribadi_Kamu");
        System.out.println("======================");
        System.out.println("NIK = " + nik);
        System.out.println("Nama = " + nama);
        System.out.println("Tempat, Tanggal_Lahir = " + tmplahir + "" + tgllahir);
        System.out.println("Alamat = " + alamat);
        System.out.println("Jenis_Kelamin = " + jKel);
        
//        String nama = "NANA";
//        String nik = "999999999999";
//        String tmplahir = "Land_Of_Down", tgllahir = "09-09-9999";
//        int usia = 6;
//        char jkel = 'F';
//        double bb = 90.09;
//        System.out.println("Identitas_Pribadi");
//        System.out.println("=================");
//        System.out.println("Nomor_Induk_Kependudukan = " + nik);
//        System.out.println("Nama : " + nama);
//        System.out.format("Tempat, Tanggal_Lahir : %s %s %n", tmplahir, tgllahir);
//        System.out.println("Jkelku : " + jkel);
//        System.out.println("Berat_Badan = " + bb);
//        System.out.format("Nama dan Usiaku = %s %d %n", nama, usia);
//        System.out.format("Jkelku = %s %n", jkel);    
    }
    
}

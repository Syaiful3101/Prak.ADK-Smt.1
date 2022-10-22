/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packages;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class C_KonfersiNilai {
    public static void main(String[] args) {
        
        String nim, nama, jurusan, matkul, predikat;
        String nilhuruf = "";
        int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("========= Masukan Data =========");
        System.out.print("Masukan NIM = ");
        nim = masukan.nextLine();
        System.out.print("Masukan Nama = ");
        nama = masukan.nextLine();
        System.out.print("Matakuliah  = ");
        matkul = masukan.nextLine();
        System.out.print("Masukan Nilai Angka = ");
        nilai = masukan.nextInt();
       
        //proses nilai
        if (nilai >= 85 && nilai <=100) {
            nilhuruf = "A";
            predikat = "Sangat Memuaskan";
        } else if (nilai >= 80 && nilai <= 84) {
            nilhuruf = "A-";
            predikat = "Sangat Memuaskan";
        } else if (nilai >= 75 && nilai <= 79 ) {
            nilhuruf = "B+";
            predikat = "Memuaskan";
        } else if (nilai >= 70 && nilai <= 74) {
            nilhuruf = "B";
            predikat = "Memuaskan";
        } else if (nilai >= 65 && nilai <= 69) {
            nilhuruf = "B-";
            predikat = "Memuaskan";
        } else if (nilai >= 60 && nilai <= 64) {
            nilhuruf = "C+";
            predikat = "Cukup";
        } else if (nilai >= 55 && nilai <= 59) {
            nilhuruf = "C";
            predikat = "Cukup";
        } else if (nilai >= 50 && nilai <= 54) {
            nilhuruf = "C-";
            predikat = "Cukup";
        } else if (nilai >= 45 && nilai <= 49) {
            nilhuruf = "D";
            predikat = "Kurang";
        } else if (nilai >= 0 && nilai <= 44) {
            nilhuruf = "E";
            predikat = "Sangat Kurang";
        } else {
            predikat = "Nilai Tidak Valid";
        }  
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("====Hasil Pengelolahan Data====");
        
        // Pengambilan jurusan dari NIM
        // Penggunaan else if
//      prodi = nim.substring(3, 5);
//      if (jurusan.equals("52")){
//          System.out.println("Program Study = S1-Teknik Informatika");
//      } else if (jurusan.equals("51")){
//          System.out.println("Program Study = S1-Sistem Informasi"); 
//      } else if (jurusan.equals("31")){
//          System.out.println("Program Study = D3-Sistem Informasi");
//      } else {
//          System.out.println("Program Study Tidak Terdeteksi");
//      }

        // Penggunaan case
        jurusan = nim.substring(3, 5);
        switch (jurusan) {
            case "52":
                System.out.println("Program Study = S1-Teknik Informatika");
                break;
            case "51":
                System.out.println("Program Study = S1-Sistem Informasi");
                break;
            case "31":
                System.out.println("Program Study = D3-Sistem Informasi");
                break;
            default:
                System.out.println("Program Study Tidak Dikenali");
                break;
        }
        
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        
        System.out.println("Mata Kuliah : " + matkul);
        System.out.println("Nilai : " + nilai);
        System.out.println("Predikat Nilai : " + nilhuruf + " - " + predikat);
        
    }
}

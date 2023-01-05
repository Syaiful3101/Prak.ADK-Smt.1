/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Lab Lenovo
 */
public class UAP{
    public static void main(String[] args) {
           
//            NO.1
        Scanner scanner = new Scanner(System.in);
        String nim, nama, jurusan , tahunAjaran, pilihan;
        
        do{            
//            NO.2
            System.out.print("Masukan NIM : ");
            nim = scanner.nextLine();
            System.out.print("Masukan NAMA : ");
            nama = scanner.nextLine();
            
            System.out.println("NIM                 = " + nim);
            System.out.println("NAMA                = " + nama);
            
//            NO.4
            tahunAjaran = nim.substring(0, 2);
                if (tahunAjaran.equals("20")){
                    System.out.println("Tahun Ajaran Masuk  = 2020-2021");
                } else if (tahunAjaran.equals("21")){
                    System.out.println("Tahun Ajaran Masuk  = 2021-2022"); 
                } else if (tahunAjaran.equals("22")){
                    System.out.println("Tahun Ajaran Masuk  = 2022-2023");
                } else {
                    System.out.println("Tidak Terdeteksi");
                }
            
//            NO.3
            jurusan = nim.substring(3, 5);
                if (jurusan.equals("31")){
                    System.out.println("Jurusan             = D3 - Sistem Informasi");
                } else if (jurusan.equals("51")){
                    System.out.println("Jurusan             = S1 - Sistem Informasi"); 
                } else if (jurusan.equals("52")){
                    System.out.println("Jurusan             = S1 - Teknik Informatika");
                } else {
                    System.out.println("Jurusan             = Tidak Terdeteksi");
                }
            
//            NO.5
            String[] pecahan = nim.split("\\.");
            System.out.println("No Urut Masuk       = " + Integer.valueOf(pecahan[2]));
            
//            NO.6
            System.out.print("Apakah Anda ingin memasukkan data lagi [ya/tidak] : ");
            pilihan = scanner.nextLine();
            
        System.out.println("");
        
        } while (pilihan.equals("ya"));
    }
}
        

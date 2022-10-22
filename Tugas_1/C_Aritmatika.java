/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packages;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class C_Aritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int jam, sisajam, menit, detik, masukan;
        Scanner in = new Scanner (System.in);
        
        System.out.println("Siatem Konversi Waktu");
        System.out.println("=====================");
        System.out.print("Masukkan angka dalam satuan detik = ");
        masukan = in.nextInt();
        
        jam = masukan / 3600;
        sisajam = masukan % 3600;
        menit = (sisajam) / 60;
        detik = sisajam % 60;
        
        System.out.print("hasil konversi = "+ jam + " jam " + menit + " menit " + detik + " detik " );
        masukan = in.nextInt();

          

    }
    
}

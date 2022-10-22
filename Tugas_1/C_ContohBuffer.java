/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lab Aplikasi
 */
public class C_ContohBuffer {
    public static void main(String[] args) throws IOException {
        String nama;
        int usia;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Masukkan_Nama = ");
        nama = br.readLine();
        System.out.print("Masukkan_Usia = ");
        usia = Integer.parseInt(br.readLine());
//        usia = br.read();
        System.out.println("Nama_Mu_Adalah = " + nama);
        System.out.println("Usia_Mu_Adalah = " + usia);
    }
}

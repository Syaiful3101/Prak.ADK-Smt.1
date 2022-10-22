/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packages;

import java.util.ArrayList;

/**
 *
 * @author Lab Aplikasi
 */
public class C_Array {
    public static void main(String[] args) {
        
//        String[] nama = {"nana","Nana","NANA"};
//
//        int usia[] = {19,20,21};
//        
//        String alamat[]= new String[3];
//        alamat[0]="malang";
//        alamat[1]="surabaya";
//        alamat[2]="kediri";
//        
//        for (int item=0; item<nama.length; item++){
//            System.out.println("Nama_Saya = "+nama[item]+ "\n"
//                +"usia = "+usia[item]+ "\n"
//                +"alamat = "+alamat[item]);
//        }
//        for (String i: nama){
//            System.out.println("Namaku = "+i+".");
//        }
        
        ArrayList biodata = new ArrayList ();
        biodata.add("nana");
        biodata.add(19);
        biodata.add("Malang");
        biodata.add("Nana");
        biodata.add(20);
        biodata.add("NANA");
        biodata.add(21);
        
        System.out.println("Biodata ku ");
        System.out.println(biodata);
        
        System.out.println("jumlah data "+ biodata.size());
        
        System.out.println(biodata.get(2));
        
    }
    
}

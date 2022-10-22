/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packages;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class C_Percabangan {
    public static void main(String[] args) {
    
//        int angka = 2;
//        if (angka%2==0) {
//            System.out.println("Bilangan Genap");
//        } else {
//            System.out.println("Bilangan Ganjil");
//        }
         
//        int angka = 2;
//        if (angka%2==0) {
//        String hasil;
//        hasil = angka%2==0 ? "Bilangan Genap":"Bilangan Ganjil";
//        System.out.println(hasil);
//         }

//        Scanner masukan = new Scanner(System.in);
//        System.out.println("Masukkan Angka = ");
//        int angka = masukan.nextInt();
//        String hasil = angka%2==0 ? "Bilangan Genap":"Bilangan Ganjil";
//        System.out.println(hasil);
        
//        Scanner masukan = new Scanner(System.in);
//        System.out.println("Masukkan Angka = ");
//        int angka = masukan.nextInt();
//        if (angka%2==0) {
//            System.out.println("Angka "+ angka +" adalah");
//            System.out.println("Bilangan Genap");
//        } else {
//            System.out.println("Angka"+ angka +" adalah");
//            System.out.println("Bilangan Ganjil");
//        }

//        Scanner masukan = new Scanner(System.in);
//        System.out.println("Masukkan Angka = ");
//        int angka = masukan.nextInt();
//        String hasil = angka%2==0 ? "Bilangan Genap":"Bilangan Ganjil";
//        System.out.println("Angka "+ angka +" adalah \n" + hasil);
         
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Angka = ");
        int angka = masukan.nextInt();
        if (angka%2==0) {
            if (angka>10){
                System.out.println("Bilangan Genap dan");
                System.out.println("Merupakan Bilangan Puluhan");
                }
//            System.out.println("Angka"+ angka +" adalah");
//            System.out.println("Bilangan Genap");     
        }

    }
}

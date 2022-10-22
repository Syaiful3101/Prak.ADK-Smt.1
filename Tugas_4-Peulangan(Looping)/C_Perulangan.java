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
public class C_Perulangan {
    public static void main(String[] args) {
        
    //  penggunaan sum
//        int sum=0;
//        for (int i=5; i<=10; i++) {
//            sum = sum+i;
//        }
//        System.out.println(sum);

    //  penggunaan for
//        for (int i=1; i<=5; i++) {
//            System.out.println(i);
//        }
        
//        for (int i=5; i>=1; i--) {
//            System.out.println(i);
//        }
        
//        for (int i=5; i>=1; i--) {
//            for (int j=1; j<=5; j++) {
//                System.out.print(0);
//            }
//            System.out.println("");
//        }

    //  penggunaan while
//        int i=1;
//        while (i<1) {
//            System.out.println("pengulangan while " +i);
//            i++;
//        }
//        
//        int j=1;
//        do {
//            System.out.println("pengulangan do " +j);
//            j++;
//        } while (j<1);

    //  tugas!!
    //  soal a
//        for (int i=5; i>=1; i--) {
//            for (int j=1; j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }

    //  soal b
//        for (int i=5; i>=1; i--) {
//            for (int j=i; j>=1; j--) {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }

    //  soal c
//        for (int i=5; i>=1; i--) {
//            for (int j=1; j<=4; j++) {
//                System.out.print("*");
//            }
//            System.out.println("0");
//        }

    //  soal d
//        for (int i=5; i>=1; i--) {
//            for (int j=i; j<=5; j++) {
//                System.out.print("*");
//            }
//            System.out.println("0");
//        }

    //  soal e
//        for (int i=5; i>=1; i--) {
//            for (int j=i; j>=1; j--) {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }

    //  soal f
//        for (int i=5; i>=1; i--) {
//            for (int j=i; j>=1; j--) {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }

    //  latihan
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai awal = ");
        int awal = masukan.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        int akhir = masukan.nextInt();

    //  menggunakan for
//        for (int i=awal; i<=akhir; i++) {
//            if (i%2==0){
//                System.out.println(i);
//            }
//        }
    
    // menggunakan while
//        int i=awal;
//        while (i<=akhir) {
//            if (i%2==0) {
//                System.out.println(i);
//            }
//            i++;
//        }
        
    // menggunakan while
        int i=awal;
        do {
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        } while (i<=akhir);
    }
}

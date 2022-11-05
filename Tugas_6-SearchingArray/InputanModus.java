
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class InputanModus {
    public static void main(String[] args) {
 
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan Jumlah Data : ");

            int n = input.nextInt(), c;
            int[] a = new int[n];
            int[] b = new int[n];

            System.out.println("Masukkan " + n + " Data");

            int value = 0;

            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }

            for (int i = 0; i < n; i++) {
                c = 1;
                if (a[i] == -1) {
                    b[i] = 0;
                } else {
                    for (int j = 1; j < n; j++) {
                        if (a[i] == a[j]) {
                            c++;
                            a[j] = -1;
                        }
                    }
                    b[i] = c;
                }
            }

            int m = b[0];

            for (int i = 1; i < n; i++) {
                if (b[i] >= m) {
                    m = b[i];
                }
            }

            for (int i = 0; i < n; i++) {
                if (a[i] != -1) {
                    value = a[i];
                }
            }
            System.out.println("Modusnya adalah : " + value);
        }
    }
}
    

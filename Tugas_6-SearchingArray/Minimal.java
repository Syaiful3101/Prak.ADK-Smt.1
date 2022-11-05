/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Minimal {
    public static void main(String[] args) {
        
                int[] arr = new int[] {17, 43, 85, 96, 76, 90};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <  min) {
                min = arr[i];
            }
        }
        System.out.println("Bilangan Terkecil Adalah : " + min);

    }
}

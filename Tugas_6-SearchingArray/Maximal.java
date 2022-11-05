/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Maximal {
    public static void main(String[] args) {
        
                int[] arr = new int[] {17, 43, 85, 96, 76, 90};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >  max) {
                max = arr[i];
            }
        }
        System.out.println("Bilangan Terbesar Adalah : " + max);
    }
}

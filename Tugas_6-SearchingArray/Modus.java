/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Modus {
       
           static int modus(int[] arr, int n) {
        int maxValue = 0, maxCount = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = arr[i];
                }
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int n = 10;
        int arr[] = {1, 6, 7, 2, 7, 4, 6, 7, 9, 10};
        System.out.println("Modusnya adalah : " + modus(arr, n));
    }
}

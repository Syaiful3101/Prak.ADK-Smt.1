/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;
/**
 *
 * @author Lap Aplkasi
 */
public class Looping_C {
     public static void main(String[] args) {
         
         System.out.println("Tugas Looping C : ");
         
        for (int i=5; i>=1; i--) {
            for (int j=i; j>=1; j--){
                System.out.print(j+"");
            }
            System.out.println("");
        } 
        
        
        int i=5;
        while (i>=1) {
            System.out.println("");
            int j=i;
            while (j>=1) {
                System.out.print(j+"");
                j--;
            } i--;
        }
        
              
        
    }
}

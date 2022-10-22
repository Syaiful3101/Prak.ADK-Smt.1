/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author Lap Aplkasi
 */
public class Looping_E {
      public static void main(String[] args) {
          
           for (int i=5; i<5; i++) {
            for (int j=5; j>0; j--) {
                System.out.print(i == j ? "*" : "0");
            } 
            System.out.println(" ");
        }
           
         int i=0;
        do {
            System.out.println(" ");
            int j=0;
            do {
                System.out.print(i==j ? "0" : "*");
                j++;
            }while (j<5);
            i++;
        } while (i<5);
       

    }           
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author Lap Aplkasi
 */
public class Looping_D {
      public static void main(String[] args) {
          
          System.out.println("Tugas Looping D : ");
          
         for (int i=5; i>0; i--) {
             System.out.print("0");
             for (int j=0; j<5; j++){
                System.out.print(i >4 ? "0" : "*");
            }
            System.out.println("");
        }
         
         
        System.out.println(" ");
        
            int i = 5;
        
        while(i > 0){
            System.out.print("0");
            int j = 0;
            while(j < 5){
                System.out.print(i > 4 ? "0" : "*");
                j++;
            }
            System.out.println("");
            i--;
        }
        
        
    }
}

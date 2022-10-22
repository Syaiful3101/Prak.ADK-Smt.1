/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author Lap Aplkasi
 */
public class Looping_F {
      public static void main(String[] args) {
        
          System.out.println("Tugas Looping F : ");
        
        for (int i=4; i>0; i--){
            System.out.print("");
            for ( int j=0; j<4; j++){
                System.out.print(i < 2 ? "0" : "*");
            }
            System.out.println("0");
        }
    

    

int i=5;
        
        while (i > 0){
            System.out.println("");
            int j=0;
            while (j < 5){
                System.out.print(i < 2 ? "0" : "*");
                j++;
            }
            System.out.println("0");
            i--;
        }
    }
}

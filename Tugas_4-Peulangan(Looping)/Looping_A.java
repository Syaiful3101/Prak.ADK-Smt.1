/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package looping;

/**
 *
 * @author Lap Aplkasi
 */
public class Looping_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tugas Looping A : ");
    
          for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"");
            }
            System.out.println("");
        }
          
        int   i=5;
        do {
            System.out.println("");
            int j=1;
            do {
                System.out.print(j+"");
                j++;
            } while (j<=i);
            i--;
        }while (i >=1);
        
    }
    
}

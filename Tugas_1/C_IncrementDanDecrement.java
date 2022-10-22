/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packages;

/**
 *
 * @author Lab Aplikasi
 */
public class C_IncrementDanDecrement {
    
    public static void main(String[] args) {
        
        int x, y, z;
        x = 42;
        y = x++;
        z = ++x;
        
        System.out.println("Nilai awal x adalah 42");
        System.out.println("ini adalah y = x++ : " + y);
        System.out.println("ini adalah z = ++x : " + z);
    
        x = 42;
        y = x--;
        z = --x;
        
        System.out.println("Nilai awal x adalah 42");
        System.out.println("ini adalah y = x++ : " + y);
        System.out.println("ini adalah z = ++x : " + z);
        
    }
}

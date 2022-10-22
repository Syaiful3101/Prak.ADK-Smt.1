/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packages;

/**
 *
 * @author Lab Aplikasi
 */
public class C_Bit {
    public static void main(String[] args) {
    
        int a=2, b=4, c; 
        
        c = a&b;
        System.out.println("a AND b = " +c);
        
        c = a|b;
        System.out.println("a OR b = " +c);
        
        c = a^b;
        System.out.println("a EX OR b = " +c);
        
        c = ~a;
        System.out.println("NOT a = " +c);
        
        c = a<<2;
        System.out.println("a geser kiri = " +c);
        
        c = a>>2;
        System.out.println("a geser kanan = " +c);
        
    }
}

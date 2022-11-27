/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AplikasiPembalikKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

           
        System.out.print("Masukkan Sebuah Kata : ");
        String masukan = input.nextLine();
        char[] kata = masukan.toCharArray();
        
        
            for (int a = kata.length - 1; a >= 0; a--){
                if(kata[a] == 'n' && kata[a + 1] == 'g'){
                    System.out.print(kata[a + 1]);
                } else if(kata[a] == 'g' && kata[a - 1] == 'n'){
                    System.out.print(kata[a - 1]);
                } else if(kata[a] == 'n' && kata[a + 1] == 'y'){
                    System.out.print(kata[a + 1]);
                } else if(kata[a] == 'y' && kata[a - 1] == 'n'){
                    System.out.print(kata[a - 1]);
                } else {
                    System.out.print(kata[a]);
                }
            }
        System.out.println("");
        }
    }  

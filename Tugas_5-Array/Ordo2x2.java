/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugas_array;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Ordo2x2 {
    public static void main(String []args){
        
        Scanner masukan = new Scanner(System.in);
        
        int matrix1[] [] = new int[2][2]; //jumlah kurung siku untuk melihat dimensi dari array
        
        int matrix2[] [] = new int[2][2];
        
        System.out.println("Matrix 1");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++)
            {
                System.out.println("Masukkan isi Index ke [" + i +"][" +j +"] : ");
                matrix1[i][j] = masukan.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("");
        System.out.println("Matrix 2");
        
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[0].length; j++)
            {
                System.out.println("Masukkan isi Index ke [" + i +"][" +j +"] : ");
                matrix2[i][j] = masukan.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println(" ");
        System.out.println("Matrix 1 ");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matrix 2 ");
        
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[0].length; j++)
            {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        
        System.out.println("");
        System.out.println("Penjumlahan");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int hasil = matrix1[i][j] + matrix2[i][j];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Pengurangan");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int hasil = matrix1[i][j] - matrix2[i][j];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
        
        

        
        int[][] hasilKali = new int[matrix1.length][matrix2[0].length];
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix2[0].length; j++){
                int buffer = 0;
                for (int k = 0; k < matrix1[0].length; k++){
                 buffer += matrix1[i][k] * matrix2[k][j];
                
                }  
                hasilKali[i][j] = buffer;
            }
            System.out.println("");
        }
        
        System.out.println("Perkalian");
        for (int i = 0; i < hasilKali.length; i++){
            for (int j = 0; j < hasilKali[0].length; j++)
            {
                System.out.print(hasilKali[i][j] + " ");
            }
            System.out.println("");
        }
        
        
    }
    
}

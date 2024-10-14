/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_2;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class PRACTICA_2 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        System.out.println("Ingrese el primer numero");
        Scanner captu = new Scanner(System.in);
        numero1 = captu.nextInt();
        captu.nextLine();
        System.out.println("Ingrese el segundo numero");
        numero2 = captu.nextInt();
        captu.nextLine();
        
        
        for(int i = numero1 + 1; i <  numero2 ; i++){
            System.out.println(i);
           
            
        } 
        for(int i = numero2 - 1; i > numero1; i--){
            System.out.println(i);
        }
    }
    
    
}

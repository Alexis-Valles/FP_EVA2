/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica6;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class PRACTICA6 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero;
         numero = captu.nextInt();
 
        String acumulador = "";
        for(int l=1;l<=numero;l++){
            acumulador=acumulador+"*";
            System.out.println(acumulador);
        }
        
            
            for (int i = numero; i >= 1; i--){    
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println("");
        }
       
    }
}
        
    

       


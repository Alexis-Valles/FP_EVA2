/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica5;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class PRACTICA5 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = captu.nextInt();
 
        String acumulador = "";
        for (int i = 1; i <= numero; i++) {    
            acumulador += "*";
            System.out.println(acumulador);
    }
    }
}

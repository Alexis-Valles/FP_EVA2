/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class PRACTICA4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        String vocales = "aeiouAEIOU";

        String acumuladorVocales = "";
 
        for (int i = 0; i < cadena.length(); i++) {
            // Verificar si el carácter está en la lista de vocales y acumularlo
            acumuladorVocales += (vocales.indexOf(cadena.charAt(i)) != -1) ? cadena.charAt(i) + "\n" : "";
        }

        
        System.out.print(acumuladorVocales);
        }
    }

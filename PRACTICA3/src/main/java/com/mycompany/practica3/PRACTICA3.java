/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class PRACTICA3 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese el texto");
        String cadena = captu.nextLine();
        
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }
    }
}

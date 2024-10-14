/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1_a_practica6;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class PRACTICA1_A_PRACTICA6 {

    public static void main(String[] args) {
        int numero;
        System.out.println("Ingrese el nombre");
        Scanner captu = new Scanner(System.in);
        String Nombre = captu.nextLine();
        System.out.println("Ingrese el numero");
        numero = captu.nextInt();
        captu.nextLine();
        
       
        for(int i = 0; i < numero ; i++ ){
            System.out.println(Nombre);
        }
       
    }
}

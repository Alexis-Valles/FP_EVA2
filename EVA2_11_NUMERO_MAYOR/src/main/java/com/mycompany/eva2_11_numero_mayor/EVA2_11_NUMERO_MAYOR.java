/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA2_11_NUMERO_MAYOR {

    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
        int numero;
        int mayor = -1;

        while (true) {
            System.out.println("Introduzca un número:");
            numero = captu.nextInt(); 

            if (numero == -1) {
                break;
            }

            if (numero > mayor) {
                mayor = numero;
            }
        }

        if (mayor != -1) {
            System.out.println("El número más grande que ingresó fue: " + mayor);
        } else {
            System.out.println("No ingresó ningún número válido.");
        }
    }
}


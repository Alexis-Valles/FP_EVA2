/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_ciclos_arreglos;

/**
 *
 * @author alexi
 */
public class EVA2_14_CICLOS_ARREGLOS {

    public static void main(String[] args) {
        int dato, valores[];
        int[] datos, x, y, z;
        int[] arreglo = new int [100];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        
        //el sout(aareglo) solo imprime la dirreccion en la memoria 
        for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i] + " - ");
    }
        
    }
}

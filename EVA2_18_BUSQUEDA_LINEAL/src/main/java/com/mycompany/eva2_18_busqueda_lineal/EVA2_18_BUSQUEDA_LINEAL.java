/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    public static void main(String[] args) {
        int[] datos = {10, 5, 22, 85};
        int valor, posi = -1;
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor a buscar:");
        valor = captu.nextInt();
        captu.nextLine();
        
        for (int i = 0; i < datos.length; i++) {
            if(valor == datos[i]){
                //regresar la posicion
                posi = i;
                //detener el ciclo
                break;
            }
            
        }
        if (posi == -1)
            System.out.println("VALOR NO ENCONTRADO");
        else 
            System.out.println("El valor esta ubicado en la posicion" + posi);
    }
}

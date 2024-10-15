/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_pares;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA2_6_PARES {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int numero, numero2;
        System.out.println("inicio");
        numero = captu.nextInt();
        captu.nextLine();
        System.out.println("fin");
        numero2 = captu.nextInt();
        captu.nextLine();
        
        for (int i = numero; i <= numero2; i++) {
            int modulo = i % 2;
            if(modulo != 1 )
                continue;
            System.out.println(i + " - ");
            
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        int base, exp;
        
        System.out.println("¿Base?");
        Scanner captu = new Scanner(System.in);
        base = captu.nextInt();
        captu.nextLine();
        System.out.println("Exponente");
        exp = captu.nextInt();
        captu.nextLine();
        
        int resu = 1;
        for(int i = exp; i >= 1; i--){
            resu = resu * base;
        }
        System.out.println("el resultdo es" + resu);
        
        
    }
}

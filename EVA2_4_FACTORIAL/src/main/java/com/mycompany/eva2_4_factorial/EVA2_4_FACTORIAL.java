/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA2_4_FACTORIAL {

    public static void main(String[] args) {
        int factorial;
        System.out.println("Numero");
        Scanner captu = new Scanner(System.in);
        factorial = captu.nextInt();
        captu.nextLine();
        
         int resu = 1;
    for(int i = factorial; i >= 1; i--){
        resu = resu * i;
    }
        System.out.println("El resultado es" + resu);
        {
        }
        }
}

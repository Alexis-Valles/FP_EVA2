/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_while;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA2_7_WHILE {

    public static void main(String[] args) {
        int val = 1;
        while(val <= 10){
        Scanner captu = new Scanner(System.in);
        System.out.print(val + " - ");
        val++;
    
        }
        System.out.println("");
        val = 11;
        do {
          System.out.print(val + " - ");
        val++;  
           
        }while(val <= 10);
            
   }
}    
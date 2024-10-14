/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA2_2_PROMEDIO {

    public static void main(String[] args) {
        int califa, sumaCali;
        Scanner captu = new Scanner(System.in);
        //Iniciar el acumuelador
        sumaCali = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("estudiante #" + i);
        System.out.println("Cual es la calificacion?");
        califa = captu.nextInt();
        captu.nextLine(); 
        //Acumular las calificaciones
        sumaCali = sumaCali + califa;
        {
        }
        int promedio = sumaCali / 10;
            System.out.println("sumacalifa =" + sumaCali);
        }
       
        
    }

}

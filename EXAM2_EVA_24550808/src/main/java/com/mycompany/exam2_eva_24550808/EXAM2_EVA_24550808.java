/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exam2_eva_24550808;
 import java.util.Scanner;
/**
 *
 * @author alexi
 */
public class EXAM2_EVA_24550808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] computerChoices = {1, 2, 3, 2, 3, 1}; 
        int winsUser = 0, winsComputer = 0, ties = 0;
        int round = 0;

        while (true) {
            System.out.println("Elige tu jugada: (1) Piedra, (2) Papel, (3) Tijera o (0) para salir:");
            int userChoice = scanner.nextInt();

            
            if (userChoice == 0) {
                break;
            }

            
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Opción no válida, intenta de nuevo.");
                continue;
            }

            
            int computerChoice = computerChoices[round % computerChoices.length];
            System.out.print("Computadora eligió: ");
            switch (computerChoice) {
                case 1 -> System.out.println("Piedra");
                case 2 -> System.out.println("Papel");
                case 3 -> System.out.println("Tijera");
            }

           
            if (userChoice == computerChoice) {
                System.out.println("Es un empate.");
                ties++;
            } else if ((userChoice == 1 && computerChoice == 3) || // Piedra vence a Tijera
                       (userChoice == 2 && computerChoice == 1) || // Papel vence a Piedra
                       (userChoice == 3 && computerChoice == 2)) { // Tijera vence a Papel
                System.out.println("¡Ganaste esta ronda!");
                winsUser++;
            } else {
                System.out.println("¡Computadora gana esta ronda!");
                winsComputer++;
            }

            round++;
            System.out.println();
        }

       
        System.out.println("Resultados finales:");
        System.out.println("Victorias del usuario: " + winsUser);
        System.out.println("Victorias de la computadora: " + winsComputer);
        System.out.println("Empates: " + ties);
        
        scanner.close();
    }
}



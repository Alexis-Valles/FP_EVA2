/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA2_9_USUARIO_PWD {

    public static void main(String[] args) {
       String user,pwd;
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("Ingrese el usuario");
            user = captu.nextLine();
            System.out.println("Ingrese la contrasseña");
            pwd = captu.nextLine();
        }while (!(user.equals("admin") && pwd.equals("1234")));
        System.out.println("BIENVENIDO!!");
    }
}

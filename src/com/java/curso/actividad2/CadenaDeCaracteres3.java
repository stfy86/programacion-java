/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.curso.actividad2;

import java.util.Scanner;

/**
 *
 * @author Estefanis Zamora
 */
public class CadenaDeCaracteres3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String apellido1, apellido2;
        System.out.print("Ingrese el primer apellido:");
        apellido1 = teclado.next();
        System.out.print("Ingrese el segundo apellido:");
        apellido2 = teclado.next();
        if (apellido1.equals(apellido2)) {
            System.out.print("Los apellidos son iguales");
        } else {
            System.out.print("Los apellidos son distintos");
        }

    }

}

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
public class CadenaDeCaracteres2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String apenom1, apenom2;
        int edad1, edad2;
        System.out.print("Ingrese el apellido y el nombre:");
        apenom1 = teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad1 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese el apellido y el nombre:");
        apenom2 = teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad2 = teclado.nextInt();

        System.out.print("La persona de mayor edad es:");
        if (edad1 > edad2) {
            System.out.print(apenom1);
        } else {
            System.out.print(apenom2);
        }

    }

}

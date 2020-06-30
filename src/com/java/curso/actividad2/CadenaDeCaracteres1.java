/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.curso.actividad2;

import java.util.Scanner;

/**
 * Solicitar el ingreso del nombre y edad de dos personas. Mostrar el nombre de
 * la persona con menor edad.
 *
 * @author Estefanis Zamora
 * @version 1.0
 */
public class CadenaDeCaracteres1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre1, nombre2;
        int edad1, edad2;
        System.out.print("Ingrese el nombre:");
        nombre1 = teclado.next();
        System.out.print("Ingrese edad:");
        edad1 = teclado.nextInt();

        System.out.print("Ingrese el nombre:");
        nombre2 = teclado.next();
        System.out.print("Ingrese edad:");
        edad2 = teclado.nextInt();

//        System.out.print("La persona de mayor edad es:");
//        if (edad1 > edad2) {
//            System.out.print(nombre1);
//        } else {
//            System.out.print(nombre2);
//        }
        System.out.print("La persona de menor edad es:");
        if (edad1 < edad2) {
            System.out.print(nombre1);
        } else {
            System.out.print(nombre2);
        }

    }

}

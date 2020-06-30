/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.curso.actividad2;

import java.util.Scanner;

/**
 *
 * @author expeza
 */
public class Tst1 {
// metodo principal

    public static void main(String[] args) {
        // El famoso Hola Mundo
        System.out.println("Hola MUNDO");
        // Declaramos variables
        int suma, b, a;
        // Para utilzar Scanner debemos de importar java.util.Scanner
        Scanner reader = new Scanner(System.in);
        // le decimos al usuario que digite el numero para b
        System.out.print("Dibite a:");
        a = reader.nextInt();
        System.out.print("Dibite b:");
        b = reader.nextInt();

        // realizamos la sumao y lo mostramos por pantalla
        suma = a + b;
        System.out.println("El resultado de a+b: \t" + suma);

    }

}

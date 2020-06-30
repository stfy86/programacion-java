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
public class Tst2 {
// metodo principal

    public static void main(String[] args) {
        int tabla;
        System.out.println("Que tabla de multiplicar deseas revisar?");
        Scanner reader = new Scanner(System.in);
        tabla = reader.nextInt();
        System.out.println("**** TABLA DE MULTIPLICAR GENERADA DEL NUMERO " + tabla + "*****"); //MODIFIQUE
        // uso del form
        for (int var1 = 0; var1 < 10; var1++) {
            System.out.println(tabla + "x" + var1 + "=" + (var1 * tabla));
        }
        // uso de IF-ELSE
        int test = tabla; // MODIFIQUE
        if (test == 10) {
            System.out.println("test vale 10!");
        } else {
            System.out.println("test es distinto de 10");
        }
        // uso del while
        int x = 5; // MODIFIQUE
        while (x != 10) {
            x++;
            System.out.println("Vuelta:" + x);
        }
        // uso del switch
        switch (x) {
            case 10:
                System.out.println("10! XD");
                break;
            default:
                System.out.println("Distinto de 10! XD");
                break;
        }
        x = 12; //MODIFIQUE
        // uso del do-while
        do {
            System.out.println("Número:" + x);
            --x; // MODIFIQUE
        } while (x != 10);
        //Definicion de array
        int[] array = {1, 2, 3}; //MODIFIQUE
        //uso del for
        for (int y = 0; y < array.length; y++) {
            System.out.println("array[" + y + "]:" + array[y]); //MODIFIQUE
        }

    }

}

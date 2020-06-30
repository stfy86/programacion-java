/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.curso.actividad2;

/**
 *
 * @author Estefanis Zamora
 */
public class UnaClase {

    public static void main(String[] args) {
        new UnaClase().calcular();
    }
    private int numero1; //variable miembro o atributo

    public void calcular() {
        int a = 1; // variable local del metodo
        {
            System.out.println(a + ", " + numero1);
            int b = 2; // variable de bloque
            System.out.println(a + ", " + b);
            {
                int c = 3; //variable de bloque
                System.out.println(a + ", " + b + ", " + c);
            } // fin del ambito de c. Final del bloque donde se ha declarado
            System.out.println(a + ", " + b /*+ ", " + c*/); //esta linea provoca un
            // error de compilacion.
            // c esta fuera de su ambito
            // y por tanto no esta declarada
        } // fin del ambito de b. Final del bloque donde se ha declarado
    }// fin del ambito de a. Final del metodo calcular
}// fin del ambito del numero1. Final de la clase

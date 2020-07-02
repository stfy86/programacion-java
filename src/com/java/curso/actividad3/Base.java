package com.java.curso.actividad3;

/**
 * Este ejemplo muestra el uso del puntero "super" para acceder
 * al constructro de la clase pader. Tambien ilustra el uso del "super"
 * para resolver la ambiguedad entre las variables local
 * y de instancia superclase
 */
public class Base {
    int datoBase;

    public Base() {
        System.out.println("Dentro del constructor de la clase base");
        System.out.println("Asignando a datoBase 100");
        datoBase = 100;
    }
}
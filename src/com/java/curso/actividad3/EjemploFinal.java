package com.java.curso.actividad3;

public class EjemploFinal {

    public static void main(String[] args) {
        final String cadena = "Hola";
        // nos impedirá modificar el objeto en sí, sino tan sólo usar el operador  de  asignación  para  cambiar  la  referencia
        // cadena = new String("Adios");

        cadena.concat(" mundo");
    }
}

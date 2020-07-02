package com.java.curso.actividad3;

public class EjemploThis {
    // variable de instancia
    int miVariable;

    // constructor de la clase
    public EjemploThis() {
        this.miVariable = 5;
    }

    // metodo con argumentos
    void miMetodo(int miVariable) {
        System.out.println("La variable local miVariable contiene " + miVariable);
        System.out.println("La variable de instancia miVariable contiene " + this.miVariable);
    }

    public static void main(String[] args) {
        // instaciamos un objeto del tipo de la clase
        EjemploThis obj = new EjemploThis();
        // que utilizamoms para llamar a su unico metodo
        obj.miMetodo(10);
    }
}

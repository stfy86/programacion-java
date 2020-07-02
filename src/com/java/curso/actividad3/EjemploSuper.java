package com.java.curso.actividad3;

public class EjemploSuper extends Base {
    int datoSubClase;

    //constructor de la subclase
    public EjemploSuper() {
        //llamada al constructor de la clase base
        super();
        System.out.println("Dentro del constructror de la subclase");
        System.out.println("Asignando a datoSubClase 200");
        datoSubClase = 200;
    }

    void miMetodo() {
        // se crea una variable local para ocultar la variable de instancia de la clase base
        int datoBase = 300;
        System.out.println("Dentro del metodo miMetodo");
        System.out.println("El valor de la variable local es " + datoBase);
        System.out.println("El valor de la variable de instancia es " + super.datoBase);
    }

    public static void main(String[] args) {
        EjemploSuper obj = new EjemploSuper();
        System.out.println("Dentro del main");
        System.out.println("La variable de instancia en la clase contiene " + obj.datoSubClase);
        // llamada al metodo para mostrar el uso de super en la resolucion de la ambiguedad
        obj.miMetodo();
    }
}


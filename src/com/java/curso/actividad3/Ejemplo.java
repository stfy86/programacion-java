package com.java.curso.actividad3;

public class Ejemplo {
    public static void main(String[] args) {
        Usuario raul = new Usuario();
        Usuario juan = new Usuario();
        // Podemos acceder a estos métodos y atributos bien desde la propia clase
        System.out.println("Hay " + Usuario.usuarios + " usuarios");
        // o bien desde una instancia cualquiera de la clase
        System.out.println("Hay " + raul.usuarios + " usuarios");
        //  métodos  y  atributos relacionados a  los  que poder acceder sin necesidad de crear un objeto asociado
        System.out.println("PI es " + Math.PI);
        System.out.println("El coseno de 120 es  " + Math.cos(120));

    }
}

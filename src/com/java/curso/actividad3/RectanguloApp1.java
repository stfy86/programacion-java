package com.java.curso.actividad3;

public class RectanguloApp1 {
    public static void main(String[] args) {
        // objeto  denominado rect1 de  la  clase Rectangulo llamando
        // al  segundo constructor en el listado.
        // El rectángulo estará situado en el  punto de coordenadas x=10, y=20;
        // tendrá una anchura de ancho=40 y una altura de alto=80.
        Rectangulo rect1 = new Rectangulo(10, 20, 40, 80);
        // objeto denominado rect2 de la clase Rectangulo llamando al
        // tercer constructor, dicho  rectángulo  estará  situado  en
        // el  punto  de  coordenadas x=0,y=0;  y  tendrá  una  anchura
        // de ancho=40 y una altura de alto=80
        Rectangulo rect2 = new Rectangulo(40, 80);
        // objeto    denominado rect3 de    la    clase Rectangulo llamando
        // al primer constructor,
        // dicho rectángulo estará situado en el punto de coordenadas x=0,y=0;
        // y tendrá una anchura de ancho=0 y una altura de alto=0.
        Rectangulo rect3 = new Rectangulo();
        // desde  el  rectángulo rect1 llamamos  a  la  función
        // calcularArea para  calcular el área de dicho rectángulo.
        // la funcion miembro retorna un entero 40*80
        int medidaArea = rect1.calcularArea();
        System.out.println("El area del rectangulo es " + medidaArea);
        // funcion miembro que desplaza el rect2
        rect2.desplazar(10, 20);
        // funcion miembro que valida si el punto esta dentro del rectangulo
        if (rect1.estaDentro(20, 30)) {
            System.out.println("El punto esta dentro del rectangulo");
        } else {
            System.out.println("El punto esta fuera del rectangulo");
        }
    }
}

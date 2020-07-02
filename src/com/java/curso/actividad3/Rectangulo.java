package com.java.curso.actividad3;

public class Rectangulo {
    int x;
    int y;
    int ancho;
    int alto;

    /**
     * constructor sin argumentos
     */
    public Rectangulo() {
        this.x = 0;
        this.y = 0;
        this.ancho = 0;
        this.alto = 0;
    }

    /**
     * constructor con todos los argumentos
     */
    public Rectangulo(int x1, int y1, int w, int h) {
        this.x = x1;
        this.y = y1;
        this.ancho = w;
        this.alto = h;
    }

    /**
     * constructor con solo los argumentos para inicializar el ancho y alto
     */
    public Rectangulo(int w, int h) {
        this.x = 0;
        this.y = 0;
        this.ancho = w;
        this.alto = h;
    }

    int calcularArea() {
        return (ancho * alto);
    }

    void desplazar(int dx, int dy) {
        x += dx;
        y += dy;
    }

    boolean estaDentro(int x1, int y1) {
        if ((x1 > x) && (x1 < x + ancho) && (y1 > y) && (y1 < y + ancho)) {
            return true;
        }
        return false;
    }

}

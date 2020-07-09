package com.java.curso.actividad7;

/**
 *
 * @author Estefanis Zamora
 */
public class SalaCine {

    // propiedades
    int aforo;
    int ocupadas;
    String pelicula;
    double entrada;

    //constructor
    public SalaCine() {
        this.aforo = 100;
        this.ocupadas = 0;
        this.pelicula = "";
        this.entrada = 5.0;
    }

    // getter's and setter's
    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getOcupadas() {
        return ocupadas;
    }

    public void setOcupadas(int ocupadas) {
        this.ocupadas = ocupadas;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    //
    public void setLibres(int lib) {
        ocupadas = aforo - lib;
    }

    public int getLibres() {
        return aforo - ocupadas;
    }

    public double getPorcentaje() {
        return (double) ocupadas / (double) aforo * 100.0;
    }

    public double getIngresos() {
        return ocupadas * entrada;
    }

    public void vaciar() {
        ocupadas = 0;
        pelicula = "";
    }

    public void entraUno() {
        ocupadas++;
    }
}

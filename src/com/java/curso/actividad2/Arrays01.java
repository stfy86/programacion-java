/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.curso.actividad2;

/**
 *
 * @author expeza
 */
public class Arrays01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ita_nro[] = new int[4];
        for (int it_cont = 0; it_cont < 4; it_cont++) {
            //ita_nro[it_cont] = it_cont * 4;
            ita_nro[it_cont] = it_cont * 5;
            System.out.println(ita_nro[it_cont]);
        }
    }

}

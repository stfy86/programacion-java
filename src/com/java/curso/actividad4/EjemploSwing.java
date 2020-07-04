package com.java.curso.actividad4;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Estefanis Zamora
 */
public class EjemploSwing {

    public static void main(String[] args) {
        // Invoca a las instancias y accesos de Swing/AWT hechas en Event Dispatch Thread (EDT)
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // crea un JFrame, es un windows con decoraciones, o sea titulo, borde y boton
                JFrame f = new JFrame("Swing Example Window");
                f.setLayout(new FlowLayout());

                // adiciona algunos componentes
                f.add(new JLabel("Hello, world!"));
                f.add(new JButton("Press me!"));
                f.pack();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setVisible(true);
            }
        });
    }

}

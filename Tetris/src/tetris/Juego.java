/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tetris;

/**
 *
 * @author Finn
 */
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Juego extends JFrame {
    private static final int HORIZONTAL=1200,VERTICAL=840;
    private TableroTetris tablero;
    private PanelBotonesMenu botonesMenu;
    private PanelMenu barraMenu;
    private PanelJuego juego;
    public Juego() throws IOException {
        setSize(HORIZONTAL,VERTICAL);
        setTitle("PRACTICA PROG 2");
        setLocationRelativeTo(null);

        barraMenu = new PanelMenu();
        add(barraMenu, BorderLayout.NORTH);

        botonesMenu = new PanelBotonesMenu();
        add(botonesMenu, BorderLayout.WEST);

        juego = new PanelJuego();
        add(juego,BorderLayout.CENTER);

        JSplitPane pane1= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, botonesMenu, juego);
        
        JSplitPane pane2= new JSplitPane(JSplitPane.VERTICAL_SPLIT, barraMenu, pane1 );
        add(pane2);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String [] args) throws Exception {
        new Juego();
    }
}

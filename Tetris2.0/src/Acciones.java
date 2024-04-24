/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Finn y Sebastià
 */

public class Acciones extends JPanel {

    private PanelInicial panelInicio;

    public Acciones(PanelInicial panelInicio) {
        this.panelInicio = panelInicio;
    }

    public ActionListener Salir = e -> {
        System.exit(0);
    };

    public ActionListener nuevaPartida = e -> {
        System.out.println("NUEVA PARTIDA");
    };

    public ActionListener configuracion = e -> {
        System.out.println("CONFIGURACIÓN");
    };

    public ActionListener historial = e -> {
        System.out.println("HISTORIAL");
    };

    public ActionListener informacion = e -> {
        System.out.println("INFORMACIÓN");
    };

}

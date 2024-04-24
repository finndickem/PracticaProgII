/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Finn y Sebastià
 */

import javax.swing.*;
import java.awt.*;

public class PanelMenu extends JPanel {
    Color NEGRO = Color.BLACK;

    public PanelMenu() {

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(NEGRO);

        setLayout(new GridLayout(2, 1));
        setBackground(NEGRO);

        // BARRA MENU//
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.setBackground(NEGRO);
        barraMenu.setLayout(new GridLayout(1, 5));

        ImageIcon iconoNuevaPartida = new ImageIcon("iconos/iconoNuevaPartida.jpg");
        ImageIcon iconoConfiguracion = new ImageIcon("iconos/iconoConfiguracion.jpg");
        ImageIcon iconoHistorial = new ImageIcon("iconos/iconoHistorial.jpg");
        ImageIcon iconoInformacion = new ImageIcon("iconos/iconoInformacion.jpg");
        ImageIcon iconoSalir = new ImageIcon("iconos/iconoSalir.jpg");

        JButton botonNuevaPartida = new JButton(iconoNuevaPartida);
        botonNuevaPartida.setBackground(NEGRO);

        JButton botonConfiguracion = new JButton(iconoConfiguracion);
        botonConfiguracion.setBackground(NEGRO);

        JButton botonHistorial = new JButton(iconoHistorial);
        botonHistorial.setBackground(NEGRO);

        JButton botonInformacion = new JButton(iconoInformacion);
        botonInformacion.setBackground(NEGRO);

        JButton botonSalir = new JButton(iconoSalir);
        botonSalir.setBackground(NEGRO);

        panel.add(botonNuevaPartida);
        panel.add(botonConfiguracion);
        panel.add(botonHistorial);
        panel.add(botonInformacion);
        panel.add(botonSalir);

        JMenu menu = new JMenu("Menu");
        menu.setBackground(NEGRO);
        menu.setForeground(Color.WHITE);

        JMenuItem itemNuevaPartida = new JMenuItem("Nueva partida");
        itemNuevaPartida.setForeground(Color.white);
        itemNuevaPartida.setBackground(NEGRO);

        JMenuItem itemConfiguracion = new JMenuItem("Configuracion");
        itemConfiguracion.setForeground(Color.white);
        itemConfiguracion.setBackground(NEGRO);

        JMenuItem itemHistorial = new JMenuItem("Historial");
        itemHistorial.setForeground(Color.white);
        itemHistorial.setBackground(NEGRO);

        JMenuItem itemInformacion = new JMenuItem("Informacion");
        itemInformacion.setForeground(Color.white);
        itemInformacion.setBackground(NEGRO);

        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.setForeground(Color.white);
        itemSalir.setBackground(NEGRO);

        menu.add(itemNuevaPartida);
        menu.add(itemConfiguracion);
        menu.add(itemHistorial);
        menu.add(itemInformacion);
        menu.add(itemSalir);

        barraMenu.add(menu);

        add(barraMenu);
        add(panel);

        // FIN BARRA MENU//
    }
}

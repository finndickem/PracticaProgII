import javax.swing.*;
import java.awt.*;

public class PanelBotonesMenu extends JPanel {
    public PanelBotonesMenu(){
        setLayout(new BorderLayout());

        //BOTONES//
        setLayout(new GridLayout(5,1));

        JButton botonNuevaPartida = new JButton("NUEVA PARTIDA");
        add(botonNuevaPartida);
        //Color del boton
        botonNuevaPartida.setBackground(Color.BLACK);
        botonNuevaPartida.setForeground(Color.WHITE);

        JButton botonConfiguracion = new JButton("CONFIGURACIÓN");
        add(botonConfiguracion);
        //Color del boton
        botonConfiguracion.setBackground(Color.BLACK);
        botonConfiguracion.setForeground(Color.WHITE);

        JButton botonHistorial = new JButton("HISTORIAL");
        add(botonHistorial);
        //Color del boton
        botonHistorial.setBackground(Color.BLACK);
        botonHistorial.setForeground(Color.WHITE);

        JButton botonInformacion = new JButton("INFORMACIÓN");
        add(botonInformacion);
        //Color del boton
        botonInformacion.setBackground(Color.BLACK);
        botonInformacion.setForeground(Color.WHITE);

        JButton botonSalir = new JButton("SALIR");
        add(botonSalir);
        //Color del boton
        botonSalir.setBackground(Color.BLACK);
        botonSalir.setForeground(Color.WHITE);
        //FIN PANEL BOTONES//
    }
}

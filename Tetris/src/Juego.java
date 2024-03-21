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

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String [] args) throws Exception {
        new Juego();
    }
}

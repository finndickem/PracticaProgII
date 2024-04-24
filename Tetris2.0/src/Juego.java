import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Juego extends JFrame {
    private static final int HORIZONTAL = 1200, VERTICAL = 840;
    private PanelInicial panelInicial;
    private PanelMenu panelMenu;
    public Juego() throws IOException {

        setSize(HORIZONTAL, VERTICAL);
        setTitle("PRACTICA PROG 2");
        setLocationRelativeTo(null);

        panelMenu = new PanelMenu();
        add(panelMenu,BorderLayout.NORTH);

        panelInicial = new PanelInicial(Color.BLUE);
        add(panelInicial, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        new Juego();
    }
}
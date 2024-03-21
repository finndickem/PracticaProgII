import javax.swing.*;

public class Juego extends JFrame {
    private static final int HORIZONTAL=817,VERTICAL=840;
    private TableroTetris tablero;
    public Juego(){
        setSize(HORIZONTAL,VERTICAL);
        setTitle("PRACTICA PROG 2");
        setResizable(false);
        setLocationRelativeTo(null);
        tablero = new TableroTetris();
        add(tablero);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String [] args) throws Exception {
        new Juego();
    }
}

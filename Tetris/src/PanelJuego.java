import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelJuego extends JPanel {
    public static final String RUTA_FONDO_DE_PANTALLA = "imagenes/TETRIS_UIB.jpg";
    BufferedImage imagenFondo;
    public PanelJuego() throws IOException {
        System.out.println("Juan Peruano");

        imagenFondo = ImageIO.read(new File(RUTA_FONDO_DE_PANTALLA));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagenFondo != null) {
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        }
    }

}

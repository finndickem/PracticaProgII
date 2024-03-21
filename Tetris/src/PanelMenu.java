import javax.swing.*;
import java.awt.*;

public class PanelMenu extends JPanel {

    public PanelMenu(){

        setLayout(new FlowLayout(FlowLayout.LEFT));

        //BARRA MENU//
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.setBackground(Color.BLACK);

        ImageIcon iconoNuevaPartida = new ImageIcon("iconos/iconoNuevaPartida.jpg");
        ImageIcon iconoConfiguracion = new ImageIcon("iconos/iconoConfiguracion.jpg");
        ImageIcon iconoHistorial = new ImageIcon("iconos/iconoHistorial.jpg");
        ImageIcon iconoInformacion = new ImageIcon("iconos/iconoInformacion.jpg");
        ImageIcon iconoSalir = new ImageIcon("iconos/iconoSalir.jpg");

        JMenuItem itemNuevaPartida = new JMenuItem(iconoNuevaPartida);
        JMenuItem itemConfiguracion = new JMenuItem(iconoConfiguracion);
        JMenuItem itemHistorial = new JMenuItem(iconoHistorial);
        JMenuItem itemInformacion = new JMenuItem(iconoInformacion);
        JMenuItem itemSalir = new JMenuItem(iconoSalir);

        barraMenu.add(itemNuevaPartida);
        barraMenu.add(itemConfiguracion);
        barraMenu.add(itemHistorial);
        barraMenu.add(itemInformacion);
        barraMenu.add(itemSalir);

        add(barraMenu);

        //FIN BARRA MENU//

    }
}

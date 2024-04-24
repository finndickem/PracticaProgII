import javax.swing.*;
import java.awt.*;

public class PanelInicial extends JPanel {
    JButton botones[] = new JButton[5];
    String nombreBotones [] = {"NUEVA PARTIDA","CONFIGURACIÓN","HISTORIAL","INFORMACIÓN","SALIR"};
    Dimension tamañoBotones = new Dimension(150, 30);

    public PanelInicial(Color c){
        setBackground(c);

        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        add(Box.createVerticalGlue());

        add(Box.createVerticalStrut(10));

        for (int i = 0; i < botones.length; i++) {
            botones[i]= new JButton(nombreBotones[i]);
            botones[i].setPreferredSize(tamañoBotones);

            botones[i].setAlignmentX(Component.CENTER_ALIGNMENT);

            //botones[i].setBorder(new RoundedBorder(10));
            //Aqui meteria los botones redondos

            //Los colores son guias, las cambiamos luego por unos bonitos con rgb(int,int,int) :D
            botones[i].setBackground(Color.YELLOW);

            add(botones[i]);
            add(Box.createVerticalStrut(10));
        }
        add(Box.createVerticalGlue());
        setAlignmentX(Component.CENTER_ALIGNMENT);



    }

}

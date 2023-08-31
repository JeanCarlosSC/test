import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Chess AI");
        ventana.setSize(1280, 720);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.getContentPane().setBackground(Color.RED);
        ventana.getContentPane().setBackground(new Color(48,46,43));
        ventana.setLayout(null);

        //primero cargar componentes antes de mostrar para mostrar todo actualizado
        JPanel nav = new JPanel();
        nav.setBackground(new Color(38,36,34));
        nav.setBounds(0, 0, 220, 720);
        ventana.add(nav);

        JPanel tablero = new JPanel();
        tablero.setBackground(new Color(199,205,205));
        tablero.setBounds(310, 96, 512, 512);
        tablero.setLayout(null);
        ventana.add(tablero);

        for(int j=0; j<8; j++) {
            for (int i=0; i<8; i++) {
                if(i % 2 != j % 2) {
                    JPanel casilla = new JPanel();
                    casilla.setBounds(i*64, 64*j, 64, 64);
                    casilla.setBackground(new Color(104, 94, 90));
                    tablero.add(casilla);
                }
            }
        }

        JPanel movimientos = new JPanel();
        movimientos.setBackground(new Color(38,36,34));
        movimientos.setBounds(880, 16, 370, 650);
        movimientos.setLayout(null);
        ventana.add(movimientos);

        ventana.setVisible(true);
    }
}
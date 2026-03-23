package Interfaces.ejemploUIDesigner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal {
    private JFrame ventanaPrincipal;
    private JPanel panelPrincipal;
    private JButton Enviar;
    private JButton Limpiar;
    private JPanel PanelBotones;
    private JButton Reestablecer;
    private JTextField txt;


    public VentanaPrincipal() {
        ventanaPrincipal = new JFrame();
        ventanaPrincipal.setContentPane(panelPrincipal);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setVisible(true);


        Enviar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Enviar.setBackground(Color.RED);

            }
        });


        Reestablecer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Enviar.setBackground(Color.WHITE);
                txt.setText("");
            }
        });
    }

    public static void main(String[] args) {

        VentanaPrincipal v1 = new VentanaPrincipal();


    }
}

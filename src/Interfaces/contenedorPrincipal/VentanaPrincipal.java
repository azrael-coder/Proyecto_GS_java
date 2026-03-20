package Interfaces.contenedorPrincipal;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JPanel panelPrincipal;
    private JButton boton1;
    private JButton boton2;

    public VentanaPrincipal() throws HeadlessException {
        this.setTitle("Prueba Ciclo");

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(d);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        boton1 = new JButton("Aceptar");
        this.add(boton1);

        boton2 = new JButton("Cancelar");
        this.add(boton2);


        panelPrincipal = new JPanel();
        this.setContentPane(panelPrincipal);
        panelPrincipal.setBackground(Color.CYAN);

    }

    public static void main(String[] args) {
        VentanaPrincipal ventana1 = new VentanaPrincipal();
        ventana1.setVisible(true);


    }
}

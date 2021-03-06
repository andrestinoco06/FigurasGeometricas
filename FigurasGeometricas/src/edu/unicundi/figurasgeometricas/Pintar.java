package edu.unicundi.figurasgeometricas;

import javax.swing.BoxLayout;

/**
 * Clase para crear el JFrame y el JPanel.
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Pintar extends javax.swing.JFrame{
    
    /**
     * Este JFrame, para pintar siempre se llama a este, y este llama al JPanel.
     * @param coordenadas 
     */
    public Pintar(int[] coordenadas){
        super("Pintar");
        this.setSize(415,440); //tamaño
        this.setLocationRelativeTo(null);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));//para que se pueda agrandar o achicar el JFrame
        PlanoCartesiano a = new PlanoCartesiano(coordenadas);
        this.add(a);
        setVisible(true);
    }
}

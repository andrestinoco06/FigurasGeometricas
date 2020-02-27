/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 */
public class PlanoCartesiano  extends javax.swing.JPanel{
    
    int[] coordenas;
    
    public PlanoCartesiano(int[] coordenadas){
        this.coordenas = coordenadas;
        setBackground(Color.black);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Pinta linea por linea
        g.drawLine(coordenas[0]*30, coordenas[1]*30,coordenas[2]*30, coordenas[3]*30);
        g.drawLine(coordenas[2]*30, coordenas[3]*30,coordenas[4]*30, coordenas[5]*30);
        g.drawLine(coordenas[4]*30, coordenas[5]*30,coordenas[6]*30, coordenas[7]*30);
        g.drawLine(coordenas[6]*30, coordenas[7]*30,coordenas[0]*30, coordenas[1]*30);
        
        g.setColor(Color.red);
    }
}

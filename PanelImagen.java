/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi_practica1;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagen extends javax.swing.JPanel {
    int x, y;
    ImageIcon Img;

    public PanelImagen(JPanel jPanel1, ImageIcon img) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
        this.Img = img;
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    

}
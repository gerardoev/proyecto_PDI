/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdi_practica1;

import javax.swing.JFrame;
import org.math.plot.Plot2DPanel;

/**
 *
 * @author Gerardo
 */
public class OpPuntoVentana extends javax.swing.JFrame {
    private double gx[];
    private double gy[];
    /**
     * Creates new form OperadoresPunto
     */
    public OpPuntoVentana() {
        initComponents();
        
        
        //Inicialización de los valores de x
        gx = new double[256];
        for(int i=0;  i<256 ; i++){
            gx[i] = i;
        }
        
        //Generamos la identidad
        gy = new double[256];
        for(int i=0;  i<256 ; i++){
            gy[i] = OpPunto.identidad(i);
        }
        
        
        Plot2DPanel graficaIdentidad = generaIdentidad();
        actualizaGrafico(graficaIdentidad);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));

        jLabel1.setText("Gráfica:");

        jButton1.setText("test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("test2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Plot2DPanel nuevoGrafico = generaIdentidad();
        
        for(int i=0;  i<256 ; i++){
            gy[i] = OpPunto.negativo(i);
        }
        //nuevoGrafico.addLinePlot("Negativo", gx, gy);
        actualizaGrafico(nuevoGrafico);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Plot2DPanel nuevoGrafico = generaIdentidad();
        
        for(int i=0;  i<256 ; i++){
            gy[i] = 100;
        }
        nuevoGrafico.addLinePlot("Negativo", gx, gy);

        actualizaGrafico(nuevoGrafico);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void actualizaGrafico(Plot2DPanel grafica){
        grafica.setSize(327,213);
        if(jPanel1.getComponentCount() > 0){
            
            jPanel1.remove(jPanel1.getComponent(0));
            jPanel1.add(grafica);
            jPanel1.repaint();
            this.repaint();
        }else{
            jPanel1.add(grafica);
            this.repaint();
        }
    }
    
    private Plot2DPanel generaIdentidad(){
        Plot2DPanel graficaIdentidad = new Plot2DPanel();
        graficaIdentidad.setFixedBounds(0, 0, 255);
        
        gy = new double[256];
        for(int i=0;  i<256 ; i++){
            gy[i] = OpPunto.identidad(i);
        }
        
        graficaIdentidad.addLinePlot("Identidad", gx, gy);
        return graficaIdentidad;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

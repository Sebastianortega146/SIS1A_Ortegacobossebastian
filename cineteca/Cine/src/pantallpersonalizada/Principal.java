package pantallpersonalizada;

import java.awt.Color;
import java.awt.Point;

public class Principal extends javax.swing.JFrame {
    
    private Color mTransaparent;
    private Point mPoint;
    
    public Principal() {
        mTransaparent = new Color(0,0,0,0);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setBackground(mTransaparent);
        
        ImageDecore mFondo = new ImageDecore(pnlBackground, "/icons/cine.png");
        pnlBackground.add(mFondo).repaint();
        pnlBackground.setOpaque(false);
        pnlBackground.setBorder(null);
        pnlBackground.setBackground(mTransaparent);
        
        ImageDecore mSalir = new ImageDecore(pnlCerrar, "/icons/salir.png");
        pnlCerrar.add(mSalir).repaint();
        pnlCerrar.setOpaque(false);
        pnlCerrar.setBorder(null);
        pnlCerrar.setBackground(mTransaparent);
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pnlBackground = new javax.swing.JPanel();
        pnlCerrar = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBackgroundMouseDragged(evt);
            }
        });
        pnlBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBackgroundMousePressed(evt);
            }
        });

        pnlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCerrarLayout = new javax.swing.GroupLayout(pnlCerrar);
        pnlCerrar.setLayout(pnlCerrarLayout);
        pnlCerrarLayout.setHorizontalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        pnlCerrarLayout.setVerticalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jButton2.setText("Empezar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(pnlCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pnlCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackgroundMousePressed
        mPoint = evt.getPoint();
        getComponentAt(mPoint);
    }//GEN-LAST:event_pnlBackgroundMousePressed

    private void pnlBackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackgroundMouseDragged
        int CurrentX = this.getLocation().x;
        int CurrentY = this.getLocation().y;
        
        int MoveX = (CurrentX + evt.getX()) - (CurrentX + mPoint.x);
        int MoveY = (CurrentY + evt.getY()) - (CurrentY + mPoint.y);
        
        int x = CurrentX + MoveX;
        int y = CurrentY + MoveY;
        
        this.setLocation(x, y);
        
    }//GEN-LAST:event_pnlBackgroundMouseDragged

    private void pnlCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMouseClicked
        System.exit(0); 
    }//GEN-LAST:event_pnlCerrarMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu obj = new Menu(); 
        obj.setVisible(true); 
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlCerrar;
    // End of variables declaration//GEN-END:variables
}

package RPG_Start;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUIStart extends javax.swing.JFrame
{
    public GUIStart()
    {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spiel starten");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Neues Spiel");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onbtNew(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(100, 150, 0, 150);
        getContentPane().add(jButton1, gridBagConstraints);

        jButton3.setText("Spiel laden");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onbtLoad(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 150, 100, 150);
        getContentPane().add(jButton3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void onbtNew(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onbtNew
    {//GEN-HEADEREND:event_onbtNew
        GUIChooseSlot objSlot = new GUIChooseSlot();
        objSlot.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onbtNew
    private void onbtLoad(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onbtLoad
    {//GEN-HEADEREND:event_onbtLoad
        try
        {
            GUIChoose objChoose = new GUIChoose();
            objChoose.setVisible(true);
            this.dispose();
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUIStart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_onbtLoad
    public static void main(String args[])
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUIStart().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}

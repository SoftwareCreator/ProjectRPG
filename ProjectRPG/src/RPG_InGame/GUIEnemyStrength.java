package RPG_InGame;

import RPG_Fight.Data;
import RPG_Fight.GUIFight;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUIEnemyStrength extends javax.swing.JFrame
{
    public GUIEnemyStrength()
    {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfEp1 = new javax.swing.JLabel();
        tfEp2 = new javax.swing.JLabel();
        tfEp3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gegner stärke wählen");

        jLabel1.setFont(new java.awt.Font("News701 BT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wählen Sie die Gegner Stärke:");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton1.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton1.setText("Schwach");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onWeak(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 99;
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton2.setText("Mittel");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onMedium(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 60;
        jPanel1.add(jButton2, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton3.setText("Stark");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onStrong(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 60;
        jPanel1.add(jButton3, gridBagConstraints);

        jButton7.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jButton7.setText("Zurück");
        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onBack(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jButton7, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("+ 50 Gold");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("+ 100 Gold");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("+ 150 Gold");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel4, gridBagConstraints);

        tfEp1.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        tfEp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfEp1.setText("+ 2 Ep");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(tfEp1, gridBagConstraints);

        tfEp2.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        tfEp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfEp2.setText("+ 5 Ep");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(tfEp2, gridBagConstraints);

        tfEp3.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        tfEp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfEp3.setText("+ 7 Ep");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(tfEp3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void onWeak(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onWeak
    {//GEN-HEADEREND:event_onWeak
        Data.setEnemyStrength(1);
        GUIFight obj = new GUIFight();
        ChangeTxt obj2 = new ChangeTxt();
        GetElementAtTxt obj3 = new GetElementAtTxt();
        try
        {
            String temp = obj3.getElementAt(9);
            int out = Integer.parseInt(temp) + 50;
            obj2.changeTxt(9, out + "");
            String temp2 = obj3.getElementAt(3);
            int out2 = Integer.parseInt(temp2) + 2;
            obj2.changeTxt(3, out2 + "");
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUIEnemyStrength.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onWeak
    private void onMedium(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onMedium
    {//GEN-HEADEREND:event_onMedium
        Data.setEnemyStrength(2);
        GUIFight obj = new GUIFight();
        ChangeTxt obj2 = new ChangeTxt();
        GetElementAtTxt obj3 = new GetElementAtTxt();
        try
        {
            String temp = obj3.getElementAt(9);
            int out = Integer.parseInt(temp) + 100;
            obj2.changeTxt(9, out + "");
            String temp2 = obj3.getElementAt(3);
            int out2 = Integer.parseInt(temp2) + 5;
            obj2.changeTxt(3, out2 + "");
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUIEnemyStrength.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onMedium
    private void onStrong(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onStrong
    {//GEN-HEADEREND:event_onStrong
        Data.setEnemyStrength(3);
        GUIFight obj = new GUIFight();
        ChangeTxt obj2 = new ChangeTxt();
        GetElementAtTxt obj3 = new GetElementAtTxt();
        try
        {
            String temp = obj3.getElementAt(9);
            int out = Integer.parseInt(temp) + 150;
            obj2.changeTxt(9, out + "");
            String temp2 = obj3.getElementAt(3);
            int out2 = Integer.parseInt(temp2) + 7;
            obj2.changeTxt(3, out2 + "");
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUIEnemyStrength.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onStrong
    private void onBack(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBack
    {//GEN-HEADEREND:event_onBack
        try
        {
            GUIInGame obj = new GUIInGame();
            obj.setVisible(true);
            this.dispose();
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUIEnemyStrength.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_onBack
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
            java.util.logging.Logger.getLogger(GUIEnemyStrength.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUIEnemyStrength.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUIEnemyStrength.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUIEnemyStrength.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUIEnemyStrength().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tfEp1;
    private javax.swing.JLabel tfEp2;
    private javax.swing.JLabel tfEp3;
    // End of variables declaration//GEN-END:variables
}

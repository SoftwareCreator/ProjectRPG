package RPG_Start;

import RPG_character.GUICharacter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUIChooseSlot extends javax.swing.JFrame
{
    File file1 = new File("Character1.txt");
    File file2 = new File("Character2.txt");
    File file3 = new File("Character3.txt");
    public int slot;
    public GUIChooseSlot()
    {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void delete(File file)
    {
        try
        {
            file.delete();
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("leer");
            writer.flush();
            writer.close();
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
        }
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
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Charakter Slot wählen");

        jLabel1.setFont(new java.awt.Font("News701 BT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wählen einen Slot:");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton1.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton1.setText("Slot 1");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                on1(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 60;
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton2.setText("Slot 2");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                on2(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 60;
        jPanel1.add(jButton2, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton3.setText("Slot 3");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                on3(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 60;
        jPanel1.add(jButton3, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onDelete1(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jButton4, gridBagConstraints);

        jButton5.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onDelete2(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jButton5, gridBagConstraints);

        jButton6.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onDelete3(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jButton6, gridBagConstraints);

        jButton7.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jButton7.setText("Back");
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
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jButton7, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void on1(java.awt.event.ActionEvent evt)//GEN-FIRST:event_on1
    {//GEN-HEADEREND:event_on1
        try
        {   
            slot = 1;
            Common.setX(slot);
            GUICharacter obj = new GUICharacter();
            if(!file1.exists())
            {
                file1.createNewFile();
            }
            BufferedReader in1 = new BufferedReader(new FileReader(file1));
            if(in1.readLine().equals("leer"))
            {
                if(JOptionPane.showConfirmDialog(this, "Wollen Sie Slot1 benützen?", "Neuer Charakter", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
                {
                    obj.setVisible(true);
                    this.dispose();
                }
            }
            else
            {
                if(JOptionPane.showConfirmDialog(this, "Wollen Sie Slot1 überschreiben?", "Überschreiben", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
                {
                    delete(file1);
                    obj.setVisible(true);
                    this.dispose();
                }
            }
            in1.close();
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUIChooseSlot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_on1
    private void on2(java.awt.event.ActionEvent evt)//GEN-FIRST:event_on2
    {//GEN-HEADEREND:event_on2
        try
        {
            slot = 2;
            Common.setX(slot);
            GUICharacter obj = new GUICharacter();
            if(!file2.exists())
            {
                file2.createNewFile();
            }
            BufferedReader in2 = new BufferedReader(new FileReader(file2));
            if(in2.readLine().equals("leer"))
            {
                if(JOptionPane.showConfirmDialog(this, "Wollen Sie Slot2 benützen?", "Neuer Charakter", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
                {
                    obj.setVisible(true);
                    this.dispose();
                }
            }
            else
            {
                if(JOptionPane.showConfirmDialog(this, "Wollen Sie Slot2 überschreiben?", "Überschreiben", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
                {
                    delete(file2);
                    obj.setVisible(true);
                    this.dispose();
                }
            }
            in2.close();
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUIChooseSlot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_on2
    private void on3(java.awt.event.ActionEvent evt)//GEN-FIRST:event_on3
    {//GEN-HEADEREND:event_on3
        try
        {
            slot = 3;
            Common.setX(slot);
            GUICharacter obj = new GUICharacter();
            if(!file3.exists())
            {
                file3.createNewFile();
            }
            BufferedReader in3 = new BufferedReader(new FileReader(file3));
            if(in3.readLine().equals("leer"))
            {
                if(JOptionPane.showConfirmDialog(this, "Wollen Sie Slot3 benützen?", "Neuer Charakter", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
                {
                    obj.setVisible(true);
                    this.dispose();
                }
            }
            else
            {
                if(JOptionPane.showConfirmDialog(this, "Wollen Sie Slot3 überschreiben?", "Überschreiben", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
                {
                    delete(file3);
                    obj.setVisible(true);
                    this.dispose();
                }
            }
            in3.close();
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUIChooseSlot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_on3
    private void onDelete1(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDelete1
    {//GEN-HEADEREND:event_onDelete1
        if(JOptionPane.showConfirmDialog(this, "Wollen Sie Slot1 löschen?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
        {
            delete(file1);
        }
    }//GEN-LAST:event_onDelete1
    private void onDelete2(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDelete2
    {//GEN-HEADEREND:event_onDelete2
        if(JOptionPane.showConfirmDialog(this, "Wollen Sie Slot2 löschen?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
        {
            delete(file2);
        }
    }//GEN-LAST:event_onDelete2
    private void onDelete3(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDelete3
    {//GEN-HEADEREND:event_onDelete3
        if(JOptionPane.showConfirmDialog(this, "Wollen Sie Slot3 löschen?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
        {
            delete(file3);
        }
    }//GEN-LAST:event_onDelete3
    private void onBack(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBack
    {//GEN-HEADEREND:event_onBack
        GUIStart obj = new GUIStart();
        obj.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(GUIChooseSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUIChooseSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUIChooseSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUIChooseSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUIChooseSlot().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

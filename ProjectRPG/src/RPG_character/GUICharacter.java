package RPG_character;

import RPG_InGame.GUIInGame;
import RPG_Start.Common;
import RPG_Start.GUIChooseSlot;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUICharacter extends javax.swing.JFrame
{
    private String klasse = "";
    private String name = "";
    private String level = "1";
    private String hp = "";
    private String dmg = "";
    private String crit = "5";
    private String rüstung = "5";
    private String abilityLevel = "1";
    private String gold = "0";
    private String ep = "0";
    private String epNeeded = "10";
    private int slot;
    
    File file1 = new File("Character1.txt");
    File file2 = new File("Character2.txt");
    File file3 = new File("Character3.txt");
    public GUICharacter() throws IOException
    {
        initComponents();
        setLocationRelativeTo(null);
        slot = Common.getX();
    }
    
    public void write(File file) throws IOException
    {
        FileWriter writer = new FileWriter(file);
        writer.write(klasse);
        writer.write(System.getProperty("line.separator"));
        writer.write(name);
        writer.write(System.getProperty("line.separator"));
        writer.write(level);
        writer.write(System.getProperty("line.separator"));
        writer.write(ep);
        writer.write(System.getProperty("line.separator"));
        writer.write(epNeeded);
        writer.write(System.getProperty("line.separator"));
        writer.write(hp);
        writer.write(System.getProperty("line.separator"));
        writer.write(dmg);
        writer.write(System.getProperty("line.separator"));
        writer.write(crit);
        writer.write(System.getProperty("line.separator"));
        writer.write(rüstung);
        writer.write(System.getProperty("line.separator"));
        writer.write(abilityLevel);
        writer.write(System.getProperty("line.separator"));
        writer.write(gold);
        writer.write(System.getProperty("line.separator"));
        writer.flush();
        writer.close();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Klasse wählen");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jButton1.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton1.setText("Waldläufer");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onWaldläufer(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton2.setText("Mönch");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onMönch(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton3.setText("Krieger");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onKrieger(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton4.setText("Tank");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onTank(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        getContentPane().add(jButton4, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Schadow BT", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bitte  wähle  eine  Klasse:                                                                    ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("News701 BT", 0, 10)); // NOI18N
        jLabel2.setText("20 HP | 7,5 DMG | Fähigkeit: 3x kein Schaden");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("News701 BT", 0, 10)); // NOI18N
        jLabel3.setText("15 HP | 10 DMG | Fähigkeit: Heilung alle 10 Sekunden");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("News701 BT", 0, 10)); // NOI18N
        jLabel4.setText("10 HP | 15 DMG | Fähigkeit: 1x doppelter Schaden");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("News701 BT", 0, 10)); // NOI18N
        jLabel5.setText("15 HP | 10 DMG | Fähigkeit: 25% Chance auszuweichen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel5, gridBagConstraints);

        jButton5.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onBack(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jButton5, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void onTank(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onTank
    {//GEN-HEADEREND:event_onTank
        klasse = "Tank";
        hp = "20";
        dmg = "7";
        while(name.equals(""))
        {
            name = JOptionPane.showInputDialog(this, "Bitte gib den Namen deines Tanks ein: ", "Name", JOptionPane.PLAIN_MESSAGE);
        }
        if(slot == 1)
        {
            try
            {
                write(file1);
            }
            catch(IOException ex)
            {
                Logger.getLogger(GUICharacter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(slot == 2)
        {
            try
            {
                write(file2);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        else
        {
            try
            {
                write(file3);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        
        try
        {
            GUIInGame obj = new GUIInGame();
            obj.setVisible(true);
            this.dispose();
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUICharacter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_onTank
    private void onMönch(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onMönch
    {//GEN-HEADEREND:event_onMönch
        klasse = "Mönch";
        hp = "15";
        dmg = "10";
        while(name.equals(""))
        {
            name = JOptionPane.showInputDialog(this, "Bitte gib den Namen deines Mönchs ein: ", "Name", JOptionPane.PLAIN_MESSAGE);
        }
        if(slot == 1)
        {
            try
            {
                write(file1);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        else if(slot == 2)
        {
            try
            {
                write(file2);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        else
        {
            try
            {
                write(file3);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        
        try
        {
            GUIInGame obj = new GUIInGame();
            obj.setVisible(true);
            this.dispose();
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUICharacter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_onMönch
    private void onKrieger(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onKrieger
    {//GEN-HEADEREND:event_onKrieger
        klasse = "Krieger";
        hp = "10";
        dmg = "15";
        while(name.equals(""))
        {
            name = JOptionPane.showInputDialog(this, "Bitte gib den Namen deines Kriegers ein: ", "Name", JOptionPane.PLAIN_MESSAGE);
        }
        if(slot == 1)
        {
            try
            {
                write(file1);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        else if(slot == 2)
        {
            try
            {
                write(file2);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        else
        {
            try
            {
                write(file3);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        
        try
        {
            GUIInGame obj = new GUIInGame();
            obj.setVisible(true);
            this.dispose();
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUICharacter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_onKrieger
    private void onWaldläufer(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onWaldläufer
    {//GEN-HEADEREND:event_onWaldläufer
        klasse = "Waldläufer";
        hp = "15";
        dmg = "10";
        while(name.equals(""))
        {
            name = JOptionPane.showInputDialog(this, "Bitte gib den Namen deines Waldläufers ein: ", "Name", JOptionPane.PLAIN_MESSAGE);
        }
        if(slot == 1)
        {
            try
            {
                write(file1);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        else if(slot == 2)
        {
            try
            {
                write(file2);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        else
        {
            try
            {
                write(file3);
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
            }
        }
        
        try
        {
            GUIInGame obj = new GUIInGame();
            obj.setVisible(true);
            this.dispose();
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUICharacter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_onWaldläufer
    private void onBack(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBack
    {//GEN-HEADEREND:event_onBack
        GUIChooseSlot obj = new GUIChooseSlot();
        this.dispose();
        obj.setVisible(true);
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
            java.util.logging.Logger.getLogger(GUICharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUICharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUICharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUICharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new GUICharacter().setVisible(true);
                }
                catch(IOException ex)
                {
                    Logger.getLogger(GUICharacter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

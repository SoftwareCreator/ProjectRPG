package RPG_Start;

import RPG_InGame.GUIInGame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUIChoose extends javax.swing.JFrame
{
    File file1 = new File("Character1.txt");
    File file2 = new File("Character2.txt");
    File file3 = new File("Character3.txt");
    private int index = -1;
    private Model characters;
    GUIStart objBack = new GUIStart();
    
    public GUIChoose() throws FileNotFoundException, IOException
    {
        initComponents();
        setLocationRelativeTo(null);
        characters = new Model();
        liCharacters.setModel(characters);
        
        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        String out1 = "";
        String in1 = br1.readLine();
        if(!in1.equals("leer"))
        {
            out1 += in1;
            in1 = br1.readLine();
            out1 += " [ ";
            out1 += in1;
            out1 += " ]";
            Characters c1 = new Characters(out1);
            characters.add(c1);
        }
        else
        {
            Characters c1 = new Characters("");
            characters.add(c1);
        }
        
        BufferedReader br2 = new BufferedReader(new FileReader(file2));
        String out2 = "";
        String in2 = br2.readLine();
        if(!in2.equals("leer"))
        {
            out2 += in2;
            in2 = br2.readLine();
            out2 += " [ ";
            out2 += in2;
            out2 += " ]";
            Characters c2 = new Characters(out2);
            characters.add(c2);
        }
        else
        {
            Characters c2 = new Characters("");
            characters.add(c2);
        }
        
        BufferedReader br3 = new BufferedReader(new FileReader(file3));
        String out3 = "";
        String in3 = br3.readLine();
        if(!in3.equals("leer"))
        {
            out3 += in3;
            in3 = br3.readLine();
            out3 += " [ ";
            out3 += in3;
            out3 += " ]";
            Characters c3 = new Characters(out3);
            characters.add(c3);
        }
        else
        {
            Characters c3 = new Characters("");
            characters.add(c3);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        liCharacters = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Charakter wählen");

        liCharacters.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                onClicked(evt);
            }
        });
        jScrollPane1.setViewportView(liCharacters);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(3, 1));

        jButton1.setText("Choose");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onChoose(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onDelete(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onBack(evt);
            }
        });
        jPanel1.add(jButton3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void onBack(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBack
    {//GEN-HEADEREND:event_onBack
        this.dispose();
        objBack.setVisible(true);
    }//GEN-LAST:event_onBack
    private void onClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_onClicked
    {//GEN-HEADEREND:event_onClicked
        index = liCharacters.getSelectedIndex();
    }//GEN-LAST:event_onClicked
    private void onChoose(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onChoose
    {//GEN-HEADEREND:event_onChoose
        if(index == -1)
        {
            JOptionPane.showMessageDialog(this, "Bitte Charakter auswählen!");
        }    
        else
        {
            Common.setX(index + 1);
            try
            {
                GUIInGame obj = new GUIInGame();
                obj.setVisible(true);
                this.dispose();
            }
            catch(IOException ex)
            {
                Logger.getLogger(GUIChoose.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_onChoose
    private void onDelete(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDelete
    {//GEN-HEADEREND:event_onDelete
        try
        {
            if(index == 0)
            {
                File file = new File("Character1.txt");
                file.delete();
                file.createNewFile();
                FileWriter writer = new FileWriter(file);
                writer.write("leer");
                writer.flush();
                writer.close();
                characters.remove(index);
            }
            else if(index == 1)
            {
                File file = new File("Character2.txt");
                file.delete();
                file.createNewFile();
                FileWriter writer = new FileWriter(file);
                writer.write("leer");
                writer.flush();
                writer.close();
                characters.remove(index);
            }
            else
            {
                File file = new File("Character3.txt");
                file.delete();
                file.createNewFile();
                FileWriter writer = new FileWriter(file);
                writer.write("leer");
                writer.flush();
                writer.close();
                characters.remove(index);
            }
        }
        catch(IOException ex)
        {
            Logger.getLogger(GUIChoose.class.getName()).log(Level.SEVERE, null, ex);
        } catch(Exception ex)
        {
            Logger.getLogger(GUIChoose.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_onDelete
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
            java.util.logging.Logger.getLogger(GUIChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUIChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUIChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUIChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new GUIChoose().setVisible(true);
                }
                catch(IOException ex)
                {
                    Logger.getLogger(GUIChoose.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList liCharacters;
    // End of variables declaration//GEN-END:variables
}

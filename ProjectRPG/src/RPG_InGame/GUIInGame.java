package RPG_InGame;

import RPG_Fight.Data;
import RPG_Start.Common;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUIInGame extends javax.swing.JFrame
{
    private String zeile;
    private String nameFight;
    private int slot;
    Random rand = new Random();
    
    public GUIInGame() throws IOException
    {
        initComponents();
        setLocationRelativeTo(null);
        slot = Common.getX();
        
        String name = "";
        if(slot == 1)
        {
            Data.setTxt(1);
            BufferedReader in = new BufferedReader(new FileReader("Character1.txt"));
            zeile = in.readLine();
            if(!zeile.substring(0,1).equals("T") && !zeile.substring(0,1).equals("M") && !zeile.substring(0,1).equals("K") && !zeile.substring(0,1).equals("W"))
            {
                name += zeile.substring(1);
            }
            else
            {
                name += zeile;
            }
            zeile = in.readLine();
            name += " [ ";
            name += zeile;
            nameFight = zeile;
            name += " ]";
            lbName.setText(name);
            //-------------------
            zeile = in.readLine();
            lbLevel.setText(zeile);
            //-------------------
            zeile = in.readLine();
            String out = zeile + "/";
            zeile = in.readLine();
            out += zeile;
            lbEp.setText(out);
            //---------------------
            zeile = in.readLine();
            lbHP.setText(zeile);
            //---------------------
            zeile = in.readLine();
            lbdmg.setText(zeile);
            //---------------------
            zeile = in.readLine();
            lbCrit.setText(zeile + "%");
            //---------------------
            zeile = in.readLine();
            lbRüstung.setText(zeile);
            //---------------------
            zeile = in.readLine();
            lbAbilityLevel.setText(zeile);
            //---------------------
            zeile = in.readLine();
            tfGold.setText(zeile);
            in.close();
        }
        else if(slot == 2)
        {
            Data.setTxt(2);
            BufferedReader in = new BufferedReader(new FileReader("Character2.txt"));
            zeile = in.readLine();
            if(!zeile.substring(0,1).equals("T") && !zeile.substring(0,1).equals("M") && !zeile.substring(0,1).equals("K") && !zeile.substring(0,1).equals("W"))
            {
                name += zeile.substring(1);
            }
            else
            {
                name += zeile;
            }
            zeile = in.readLine();
            name += " [ ";
            name += zeile;
            nameFight = zeile;
            name += " ]";
            lbName.setText(name);
            //-------------------
            zeile = in.readLine();
            lbLevel.setText(zeile);
            //-------------------
            zeile = in.readLine();
            String out = zeile + "/";
            zeile = in.readLine();
            out += zeile;
            lbEp.setText(out);
            //---------------------
            zeile = in.readLine();
            lbHP.setText(zeile);
            //---------------------
            zeile = in.readLine();
            lbdmg.setText(zeile);
            //---------------------
            zeile = in.readLine();
            lbCrit.setText(zeile + "%");
            //---------------------
            zeile = in.readLine();
            lbRüstung.setText(zeile);
            //---------------------
            zeile = in.readLine();
            lbAbilityLevel.setText(zeile);
            //---------------------
            zeile = in.readLine();
            tfGold.setText(zeile);
            in.close();
        }
        else
        {
            Data.setTxt(3);
            BufferedReader in = new BufferedReader(new FileReader("Character3.txt"));
            zeile = in.readLine();
            if(!zeile.substring(0,1).equals("T") && !zeile.substring(0,1).equals("M") && !zeile.substring(0,1).equals("K") && !zeile.substring(0,1).equals("W"))
            {
                name += zeile.substring(1);
            }
            else
            {
                name += zeile;
            }
            zeile = in.readLine();
            name += " [ ";
            name += zeile;
            nameFight = zeile;
            name += " ]";
            lbName.setText(name);
            //-------------------
            zeile = in.readLine();
            lbLevel.setText(zeile);
            //-------------------
            zeile = in.readLine();
            String out = zeile + "/";
            zeile = in.readLine();
            out += zeile;
            lbEp.setText(out);
            //---------------------
            zeile = in.readLine();
            lbHP.setText(zeile);
            //---------------------
            zeile = in.readLine();
            lbdmg.setText(zeile);
            //---------------------
            zeile = in.readLine();
            lbCrit.setText(zeile + "%");
            //---------------------
            zeile = in.readLine();
            lbRüstung.setText(zeile);
            //---------------------
            zeile = in.readLine();
            lbAbilityLevel.setText(zeile);
            //---------------------
            zeile = in.readLine();
            tfGold.setText(zeile);
            in.close();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        lbName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbLevel = new javax.swing.JTextField();
        lbEp = new javax.swing.JTextField();
        lbHP = new javax.swing.JTextField();
        lbdmg = new javax.swing.JTextField();
        lbCrit = new javax.swing.JTextField();
        lbRüstung = new javax.swing.JTextField();
        lbAbilityLevel = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfGold = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList9 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RPG");

        lbName.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("Klasse [ Name ]");

        jLabel2.setFont(new java.awt.Font("Schadow BT", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Statistik");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Level:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 53;
        jPanel4.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Erfahrung:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 53;
        jPanel4.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("HP:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 53;
        jPanel4.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Damage:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 53;
        jPanel4.add(jLabel12, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Kritischerwert:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 53;
        jPanel4.add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Rüstung:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 53;
        jPanel4.add(jLabel14, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Fähigkeit Lv:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 53;
        jPanel4.add(jLabel15, gridBagConstraints);

        jPanel1.add(jPanel4, new java.awt.GridBagConstraints());

        jPanel5.setLayout(new java.awt.GridBagLayout());

        lbLevel.setEditable(false);
        lbLevel.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        lbLevel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbLevel.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 36;
        jPanel5.add(lbLevel, gridBagConstraints);

        lbEp.setEditable(false);
        lbEp.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        lbEp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbEp.setText("0/10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 36;
        jPanel5.add(lbEp, gridBagConstraints);

        lbHP.setEditable(false);
        lbHP.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        lbHP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbHP.setText("15");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 36;
        jPanel5.add(lbHP, gridBagConstraints);

        lbdmg.setEditable(false);
        lbdmg.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        lbdmg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbdmg.setText("10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 36;
        jPanel5.add(lbdmg, gridBagConstraints);

        lbCrit.setEditable(false);
        lbCrit.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        lbCrit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbCrit.setText("5%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 36;
        jPanel5.add(lbCrit, gridBagConstraints);

        lbRüstung.setEditable(false);
        lbRüstung.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        lbRüstung.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbRüstung.setText("5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 36;
        jPanel5.add(lbRüstung, gridBagConstraints);

        lbAbilityLevel.setEditable(false);
        lbAbilityLevel.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        lbAbilityLevel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbAbilityLevel.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 36;
        jPanel5.add(lbAbilityLevel, gridBagConstraints);

        jPanel1.add(jPanel5, new java.awt.GridBagConstraints());

        jPanel24.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Gold:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 7;
        jPanel24.add(jLabel1, gridBagConstraints);

        tfGold.setEditable(false);
        tfGold.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        tfGold.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfGold.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 129;
        gridBagConstraints.ipady = 7;
        jPanel24.add(tfGold, gridBagConstraints);

        jLabel26.setFont(new java.awt.Font("Schadow BT", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Ausrüstung");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Helm:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Amulett:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Brustpanzer:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Beinschutz:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel3.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Schuhe:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel3.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Ring:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel3.add(jLabel8, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Rechte Hand:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel3.add(jLabel16, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Schadow BT", 0, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Linke Hand:  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel3.add(jLabel17, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel2.add(jPanel3, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel20.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Anfänger Brustpanzer");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel6.add(jPanel9, gridBagConstraints);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel21.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Anfänger Beinschutz");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel6.add(jPanel10, gridBagConstraints);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel25.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Leer");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel6.add(jPanel14, gridBagConstraints);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel19.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Leer");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel6.add(jPanel8, gridBagConstraints);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel24.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Anfänger Waffe");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel6.add(jPanel13, gridBagConstraints);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel22.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Anfänger Schuhe");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel6.add(jPanel11, gridBagConstraints);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel18.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Leer");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel6.add(jPanel7, gridBagConstraints);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel23.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Leer");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel6.add(jPanel12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jPanel6, gridBagConstraints);

        jPanel25.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Tränke / Buffs");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onBuffs(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 89;
        gridBagConstraints.ipady = 6;
        jPanel25.add(jButton1, gridBagConstraints);

        jButton2.setText("Shop");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onShop(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.ipady = 6;
        jPanel25.add(jButton2, gridBagConstraints);

        jLabel27.setFont(new java.awt.Font("Schadow BT", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Items");

        jPanel27.setLayout(new java.awt.GridBagLayout());

        jButton5.setText("Ausrüsten");
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onEquip(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = 7;
        jPanel27.add(jButton5, gridBagConstraints);

        jButton6.setText("Verkaufen");
        jButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onEquip(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = 7;
        jPanel27.add(jButton6, gridBagConstraints);

        jLabel28.setFont(new java.awt.Font("Schadow BT", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Spielen");

        jPanel26.setLayout(new java.awt.GridLayout(2, 1));

        jButton3.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton3.setText("Quests");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onQuests(evt);
            }
        });
        jPanel26.add(jButton3);

        jButton4.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jButton4.setText("Kampf");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onAttack(evt);
            }
        });
        jPanel26.add(jButton4);

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Helme", jPanel15);

        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Amulette", jPanel16);

        jScrollPane3.setToolTipText("");

        jScrollPane3.setViewportView(jList3);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Brustpanzer", jPanel17);

        jScrollPane4.setViewportView(jList4);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Beinschützer", jPanel18);

        jScrollPane5.setViewportView(jList5);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Schuhe", jPanel19);

        jScrollPane6.setViewportView(jList6);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ringe", jPanel20);

        jScrollPane7.setViewportView(jList7);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Rechte Hand", jPanel21);

        jScrollPane8.setViewportView(jList8);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Linke Hand", jPanel22);

        jScrollPane9.setViewportView(jList9);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sonstiges", jPanel23);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void onAttack(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onAttack
    {//GEN-HEADEREND:event_onAttack
        int lv = Integer.parseInt(lbLevel.getText());
        int hp = Integer.parseInt(lbHP.getText());
        int dmg = Integer.parseInt(lbdmg.getText());
        Data.setName(nameFight);
        Data.setlvPlayer(lv);
        Data.sethpPlayer(hp);
        Data.setdmgPlayer(dmg);

        double skalierung = hp / 10.0 + 0.5;
        int eLv = lv + rand.nextInt(3+1)-1;
        if(eLv < 1)
        {
            eLv = 1;
        }
        double eHp = hp * skalierung;
        double eDmg = (dmg / 3.5) * skalierung;
        Data.setlvEnemy(eLv);
        Data.sethpEnemy((int) eHp);
        Data.setdmgEnemy((int) eDmg);

        double eSkalierung = eHp / 20.0 + 0.5;

        Data.setSkalierung(skalierung);
        Data.seteSkalierung(eSkalierung);

        
        
        Data.setHeal(5);
        
        
        
        GUIEnemyStrength obj = new GUIEnemyStrength();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onAttack

    private void onQuests(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onQuests
    {//GEN-HEADEREND:event_onQuests
        // TODO add your handling code here:
    }//GEN-LAST:event_onQuests

    private void onBuffs(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onBuffs
    {//GEN-HEADEREND:event_onBuffs
        // TODO add your handling code here:
    }//GEN-LAST:event_onBuffs

    private void onShop(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onShop
    {//GEN-HEADEREND:event_onShop
        // TODO add your handling code here:
    }//GEN-LAST:event_onShop

    private void onEquip(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onEquip
    {//GEN-HEADEREND:event_onEquip
        // TODO add your handling code here:
    }//GEN-LAST:event_onEquip
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
            java.util.logging.Logger.getLogger(GUIInGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUIInGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUIInGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUIInGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new GUIInGame().setVisible(true);
                }
                catch(IOException ex)
                {
                    Logger.getLogger(GUIInGame.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JList jList5;
    private javax.swing.JList jList6;
    private javax.swing.JList jList7;
    private javax.swing.JList jList8;
    private javax.swing.JList jList9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lbAbilityLevel;
    private javax.swing.JTextField lbCrit;
    private javax.swing.JTextField lbEp;
    private javax.swing.JTextField lbHP;
    private javax.swing.JTextField lbLevel;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextField lbRüstung;
    private javax.swing.JTextField lbdmg;
    private javax.swing.JTextField tfGold;
    // End of variables declaration//GEN-END:variables
}

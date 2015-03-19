package RPG_Fight;

import java.util.Random;

public class GUIFight extends javax.swing.JFrame
{
    Random rand = new Random();
    private static String name = Data.getName();
    private static int lv = Data.getlvPlayer();
    private static int hp = Data.gethpPlayer();
    private static int dmg = Data.getdmgPlayer();
    private static int eLv = Data.getlvEnemy();
    private static int eHp = Data.gethpEnemy();
    private static int eDmg = Data.getdmgEnemy();
    private static double skalierung = Data.getSkalierung();
    private static double eSkalierung = Data.geteSkalierung();
    private static int enemyStrength = Data.getEnemyStrength();
    private int aktuelleHP = eHp;
    private int schaden;
    private static EnemyFight enemyFight;
    private Boolean first = true;
    Thread t1 = new Thread(new EnemyFight());
    
    public GUIFight()
    {
        initComponents();
        setLocationRelativeTo(null);
        lbName.setText(name);
        tfLvPlayer.setText(lv + "");
        tfHpPlayer.setText(hp + "/" + hp);
        tfDmgPlayer.setText(dmg + "");
        pbHpPlayer.setMaximum(hp);
        pbHpPlayer.setValue(eHp);
        
        System.out.println("EnemyStrength: " + enemyStrength);
        
        Data.sethpEnemySave(eHp);
        
        if(enemyStrength == 1)
        {
            eHp -= 5;
            System.out.println("Weak Hp Enemy: " + eHp);
        }
        else if(enemyStrength == 2)
        {
            System.out.println("Middle Hp Enemy: " + eHp);
        }
        else if(enemyStrength == 3)
        {
            eHp += 10 * (eHp / 30 * eSkalierung);
            System.out.println("Strong Hp Enemy: " + eHp);
        }
        
        tfLvEnemy.setText(eLv + "");
        tfHpEnemy.setText(eHp + "/" + eHp);
        tfDmgEnemy.setText(eDmg + "");
        pbHpEnemy.setMaximum(eHp);
        pbHpEnemy.setValue(eHp);
        taOut.setText("Let the fight begin!! \n");
    }
    public void stopThread()
    {
        t1.stop();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfLvPlayer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfHpPlayer = new javax.swing.JTextField();
        pbHpPlayer = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        tfDmgPlayer = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btEnemy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfLvEnemy = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfHpEnemy = new javax.swing.JTextField();
        pbHpEnemy = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        tfDmgEnemy = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taOut = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btHeal = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kampf");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbName.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("Karesh");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.ipady = 103;
        jPanel1.add(jPanel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        jPanel1.add(jLabel1, gridBagConstraints);

        tfLvPlayer.setEditable(false);
        tfLvPlayer.setFont(new java.awt.Font("News701 BT", 0, 12)); // NOI18N
        tfLvPlayer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfLvPlayer.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(tfLvPlayer, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        jPanel1.add(jLabel2, gridBagConstraints);

        tfHpPlayer.setEditable(false);
        tfHpPlayer.setFont(new java.awt.Font("News701 BT", 0, 12)); // NOI18N
        tfHpPlayer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfHpPlayer.setText("15/15");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(tfHpPlayer, gridBagConstraints);

        pbHpPlayer.setMaximum(15);
        pbHpPlayer.setValue(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(pbHpPlayer, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DMG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        jPanel1.add(jLabel5, gridBagConstraints);

        tfDmgPlayer.setEditable(false);
        tfDmgPlayer.setFont(new java.awt.Font("News701 BT", 0, 12)); // NOI18N
        tfDmgPlayer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDmgPlayer.setText("10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(tfDmgPlayer, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        btEnemy.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        btEnemy.setText("Gegner");
        btEnemy.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btEnemy.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onDamageEnemy(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 102;
        jPanel3.add(btEnemy, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        jPanel3.add(jLabel6, gridBagConstraints);

        tfLvEnemy.setEditable(false);
        tfLvEnemy.setFont(new java.awt.Font("News701 BT", 0, 12)); // NOI18N
        tfLvEnemy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfLvEnemy.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel3.add(tfLvEnemy, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        jPanel3.add(jLabel7, gridBagConstraints);

        tfHpEnemy.setEditable(false);
        tfHpEnemy.setFont(new java.awt.Font("News701 BT", 0, 12)); // NOI18N
        tfHpEnemy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfHpEnemy.setText("30/30");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel3.add(tfHpEnemy, gridBagConstraints);

        pbHpEnemy.setMaximum(15);
        pbHpEnemy.setValue(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        jPanel3.add(pbHpEnemy, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Schadow BT", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DMG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        jPanel3.add(jLabel4, gridBagConstraints);

        tfDmgEnemy.setEditable(false);
        tfDmgEnemy.setFont(new java.awt.Font("News701 BT", 0, 12)); // NOI18N
        tfDmgEnemy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDmgEnemy.setText("5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel3.add(tfDmgEnemy, gridBagConstraints);

        taOut.setEditable(false);
        taOut.setColumns(20);
        taOut.setFont(new java.awt.Font("News701 BT", 0, 10)); // NOI18N
        taOut.setRows(5);
        jScrollPane1.setViewportView(taOut);

        jButton1.setText("HP +");

        btHeal.setText("Heilen");
        btHeal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                onAbility(evt);
            }
        });

        jButton4.setText(" DMG +");

        jButton5.setText("HP -");

        jButton6.setText(" DMG - ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btHeal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btHeal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void onDamageEnemy(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onDamageEnemy
    {//GEN-HEADEREND:event_onDamageEnemy
        if(first == true)
        {
            first = false;
            t1.start();
        }
        String temp = taOut.getText();
        double ober = dmg + lv * skalierung;
        double unter = dmg - lv * skalierung;
        int tempLastHp = aktuelleHP;
        schaden = rand.nextInt((int) ober - (int) unter) + (int) unter;
        schaden++;
        aktuelleHP -= schaden;
        if(aktuelleHP <= 0)
        {
            stopThread();
            pbHpEnemy.setValue(0);
            tfHpEnemy.setText("0 /" + eHp);
            taOut.setText(temp + name + " --> Gegner: " + (tempLastHp) + "\n");
            temp = taOut.getText();
            taOut.setText(temp + name + " hat Gegner besiegt!!\n");
            btEnemy.setEnabled(false);
            eHp = Data.gethpEnemySave();
            GUIWin obj = new GUIWin();
            obj.setVisible(true);
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nach lösung entfernen
            this.dispose();
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!also wenn dieses fenster von der win / lost geschlossen werden kann
        }
        else
        {
            pbHpEnemy.setValue(aktuelleHP);
            tfHpEnemy.setText(aktuelleHP + "/" + eHp);
            taOut.setText(temp + name + " --> Gegner: " + (schaden) + "\n");
            btEnemy.setEnabled(false);
            Thread t2 = new Thread(new pauseButton());
            t2.start();
        }
    }//GEN-LAST:event_onDamageEnemy
    private void onAbility(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onAbility
    {//GEN-HEADEREND:event_onAbility
        String temp = taOut.getText();
        int heal = Data.getHeal();
        int value = pbHpPlayer.getValue();
        value += heal*(skalierung - 0.6);
        pbHpPlayer.setValue((int) value);
        tfHpPlayer.setText((int) value + "/" + hp);
        taOut.setText(temp + name + " heilt sich um " + (int) (heal*(skalierung - 0.6)) + "\n");
        
        Data.setHealPlus((int) (heal*(skalierung - 0.6)));
        enemyFight.update();
        
        btHeal.setEnabled(false);
        Thread pause = new Thread(new pauseButton2());
        pause.start();
    }//GEN-LAST:event_onAbility
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
            java.util.logging.Logger.getLogger(GUIFight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUIFight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUIFight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUIFight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUIFight().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btEnemy;
    public static javax.swing.JButton btHeal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbName;
    public static javax.swing.JProgressBar pbHpEnemy;
    public static javax.swing.JProgressBar pbHpPlayer;
    public static javax.swing.JTextArea taOut;
    private javax.swing.JTextField tfDmgEnemy;
    private javax.swing.JTextField tfDmgPlayer;
    public static javax.swing.JTextField tfHpEnemy;
    public static javax.swing.JTextField tfHpPlayer;
    private javax.swing.JTextField tfLvEnemy;
    private javax.swing.JTextField tfLvPlayer;
    // End of variables declaration//GEN-END:variables
}

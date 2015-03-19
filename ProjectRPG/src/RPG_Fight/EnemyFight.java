package RPG_Fight;

import static RPG_Fight.GUIFight.taOut;
import static RPG_Fight.GUIFight.tfHpPlayer;
import static RPG_Fight.GUIFight.pbHpPlayer;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EnemyFight implements Runnable 
{
    Random rand = new Random();
    private static String name = Data.getName();
    private static int hp = Data.gethpPlayer();
    private static int eLv = Data.getlvEnemy();
    private static int eHp = Data.gethpEnemy();
    private static int eDmg = Data.getdmgEnemy();
    private static double eSkalierung = Data.geteSkalierung();
    private static int aktuelleHP = hp;
    private int schaden;
    
    public static void update()
    {
        int healthPlus = Data.getHealPlus();
        if((aktuelleHP + healthPlus) > hp)
        {
            aktuelleHP = hp;
        }
        else
        {
            aktuelleHP += healthPlus;
        }
    }
    
    @Override
    public void run()
    {
        System.out.println("hp Player: " + hp);
        while(aktuelleHP > 0)
        {
            String temp = taOut.getText();
            double ober = (eDmg + eLv * eSkalierung) - 1;
            double unter = eDmg - eLv * eSkalierung;
            int tempLastHp = aktuelleHP;
            schaden = rand.nextInt((int) ober - (int) unter) + (int) unter;
            aktuelleHP -= schaden;
            if(aktuelleHP <= 0)
            {
                pbHpPlayer.setValue(0);
                tfHpPlayer.setText("0 /" + hp);
                taOut.setText(temp + "Gegner --> " + name + " : " + (tempLastHp) + "\n");
                temp = taOut.getText();
                taOut.setText(temp + "Gegner hat " + name + " besiegt!! \n");
                GUILost obj = new GUILost();
                obj.setVisible(true);
                GUIFight obj2 = new GUIFight();
                obj2.stopThread();
            }
            else
            {
                pbHpPlayer.setValue(aktuelleHP);
                tfHpPlayer.setText(aktuelleHP + "/" + hp);
                taOut.setText(temp + "Gegner --> " + name + " : " + (schaden) + "\n");
            }
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException ex)
            {
                Logger.getLogger(EnemyFight.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }
}

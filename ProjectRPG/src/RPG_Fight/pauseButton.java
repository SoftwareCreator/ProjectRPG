package RPG_Fight;

import java.util.logging.Level;
import java.util.logging.Logger;
import static RPG_Fight.GUIFight.btEnemy;

class pauseButton implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(3000);
            btEnemy.setEnabled(true);
        }
        catch(InterruptedException ex)
        {
            Logger.getLogger(pauseButton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

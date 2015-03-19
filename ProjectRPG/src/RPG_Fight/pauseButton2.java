package RPG_Fight;

import static RPG_Fight.GUIFight.btHeal;
import java.util.logging.Level;
import java.util.logging.Logger;

class pauseButton2 implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(7000);
            btHeal.setEnabled(true);
        }
        catch(InterruptedException ex)
        {
            Logger.getLogger(pauseButton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

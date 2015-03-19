package RPG_InGame;

import RPG_Fight.Data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChangeTxt
{
    private int txt = Data.getTxt();
    File file1 = new File("Character1.txt");
    File file2 = new File("Character2.txt");
    File file3 = new File("Character3.txt");
    private String feld[] = new String[10];
    
    public void changeTxt(int index, String neu) throws FileNotFoundException, IOException
    {
        BufferedReader in;
        FileWriter writer;
        if(txt == 1)
        {
            in = new BufferedReader(new FileReader(file1));
            writer = new FileWriter(file1, true);
        }
        else if(txt == 2)
        {
            in = new BufferedReader(new FileReader(file2));
            writer = new FileWriter(file2, true);
        }
        else
        {
            in = new BufferedReader(new FileReader(file3));
            writer = new FileWriter(file3, true);
        }
        for(int i = 0; i <= 9; i++)
        {
            String zeile = in.readLine();
            feld[i] = zeile;
        }
        in.close();
        feld[index] = neu;
        for(int i = 0; i <= 9; i++)
        {
            writer.write(feld[i]);
        }
        writer.flush();
        writer.close();
    }
}

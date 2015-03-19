package RPG_InGame;

import RPG_Fight.Data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GetElementAtTxt
{
    private int txt = Data.getTxt();
    File file1 = new File("Character1.txt");
    File file2 = new File("Character2.txt");
    File file3 = new File("Character3.txt");
    private String feld[] = new String[10];
    
    public String getElementAt(int index) throws IOException
    {
        BufferedReader in;
        if(txt == 1)
        {
            in = new BufferedReader(new FileReader(file1));
        }
        else if(txt == 2)
        {
            in = new BufferedReader(new FileReader(file2));
        }
        else
        {
            in = new BufferedReader(new FileReader(file3));
        }
        for(int i = 0; i <= 9; i++)
        {
            String zeile = in.readLine();
            feld[i] = zeile;
        }
        in.close();
        return feld[index];
    }
}

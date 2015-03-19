package RPG_Start;

import java.util.LinkedList;
import java.util.List;
import javax.swing.AbstractListModel;

public class Model extends AbstractListModel<Characters>
{
    private List<Characters> characters;

    public Model()
    {
        characters = new LinkedList<>();
    }
    
    void add(Characters character)
    {
        characters.add(character);
        super.fireIntervalAdded(this, getSize() - 1, getSize() - 1);
    }
    
    public void remove(int index) throws Exception
    {
        if(index < 0 || index >= getSize())
        {
            throw new Exception("Gültigen Index eingeben!");
        }
        characters.remove(index);
        super.fireIntervalRemoved(this, index, index);
    }
    
    @Override
    public int getSize()
    {
        return characters.size();
    }
    
    @Override
    public Characters getElementAt(int index)
    {
        return characters.get(index);
    }
}

package RPG_Start;
class Characters
{
    private String name;

    public Characters(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s", name);
    }
}

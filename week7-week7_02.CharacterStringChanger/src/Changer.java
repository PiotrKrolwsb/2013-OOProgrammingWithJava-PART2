import java.util.ArrayList;
/**
 * @author PiotrKrol
 */
public class Changer 
{
    ArrayList<Change> changes; 
    public Changer() 
    {
        changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change)
    {
        changes.add(change);
    }
    public String change(String characterString)
    {
        for ( Change ch : changes)
        {
            characterString = ch.change(characterString);
        }
        return characterString;
    }
}

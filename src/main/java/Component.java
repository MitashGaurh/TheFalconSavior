import greenfoot.*;
import java.util.*;
/**
 * Write a description of class EnemyTroops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Component implements IComponent  
{
    // instance variables - replace the example below with your own
   
    
    private ArrayList<IComponent> components = new ArrayList<>();

    
    public Component()
    {
    }
  
    public void addChild(IComponent c)
    {
        components.add(c);
    }
    
    public void removeChild(IComponent c)
    {
        components.remove(c);
    }
    
    public void display()
    {
       for(IComponent c: components)
            {
                c.display();
            }
        
    }
}

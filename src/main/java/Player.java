import greenfoot.*; 
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Player  extends Leaf
{
    // instance variables - replace the example below with your own
  

    /**
     * Constructor for objects of class Player
     */
    public Player(World world, int x, int y)
    {
        super(world,x,y);
        //super(world,x,y);
    }
    
     public void moveLeft()
    {
        if(getX() - 10 > 0)
        {
            this.setLocation(getX() -2, getY());
        }
        
    }
    
    public void moveRight()
    {
        if(getX() + 10 < this.getWorld().getWidth())
        {
            this.setLocation(getX() + 2, getY());
        }
        
    }
    
     public void act()
    {
        control();
    }
    abstract public void  control();
    
    abstract public void shoot();
    
    abstract public void display();
    
    

   
}

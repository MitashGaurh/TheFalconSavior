import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Leaf
{
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isShooting = false;

    public Life(int x, int y) {
        super(x, y, LeafFactory.getLeafType("Life", "millennium_falcon.png", null));
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
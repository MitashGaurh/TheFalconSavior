import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Leaf implements IScoreObserver
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    long time = 0;
    GreenfootImage img = new GreenfootImage("Score: " + score, 20, Color.LIGHT_GRAY, new Color(0, 0, 0, 0));
    
    public ScoreBoard(World world, int x, int y)
    {
        super(world, x, y);
    }
   
    
    public void act()
    {
        // Add your action code here.
        updateScore();
        
    }
    
    public void updateScore()
    {
        GreenfootImage img = new GreenfootImage("Score: " + score, 20, Color.LIGHT_GRAY, new Color(0, 0, 0, 0));
        setImage(img);
    }
    
    public void display()
    {
        world.addObject(this, x, y);
    }
    
    public void scoreUpdate()
    { this.score= this.score + 1;
    }
    
}

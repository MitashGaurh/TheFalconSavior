import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Player
{
    
    boolean shooting = false;
    GreenfootImage image = new GreenfootImage("millennium_falcon.png");
    ScoreBoard scoreBoard = null;
    int x;
    int y;
    
    
    public Player2(World world, int x, int y)
    {
        super(world,x,y);
        this.x=x;
        this.y=y;
        scoreBoard= new ScoreBoard(world,530,15);
    }
    
    public void  control()
     {
          if(Greenfoot.isKeyDown("a"))
        {
            moveLeft();
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            moveRight();
        }  
        
        if(Greenfoot.isKeyDown("w") && shooting == false)
        {
            shoot();
            shooting = true;
        }
        
        if(!Greenfoot.isKeyDown("w") && shooting == true)
        {
            shooting = false;
        }
    }
     
    public void shoot()
    {
        Rocket temp=new Rocket(getWorld(),getX(), getY() -10);
        IComponent rocket = new RocketDecorator(temp);
        temp.addObserver(scoreBoard);
        rocket.display();
   }
     
    
     public void display()
     {
        setImage(image);
        world.addObject(this, x, y);
        scoreBoard.display();
      }
      
     public int getScore()
     {
        return scoreBoard.score;
     }
     
     
    
}

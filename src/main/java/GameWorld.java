import greenfoot.*;

/**
 * Write a description of class GameWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameWorld extends World {

    /**
     * Constructor for objects of class GameWorld.
     */
    public GameWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        scaleBackground();
        IComponent gameScreen=new Component();
        IComponent enemyGroup=new Component();
        
        //EnemyShip e1 = new EnemyShip();
        //EnemyShip e2 = new EnemyShip();
        //EnemyShip e3 = new EnemyShip();
        //EnemyShip e4 = new EnemyShip();
        
        enemyGroup.addChild(new EnemyShip(this,100,80));
        enemyGroup.addChild(new EnemyShip(this,150,90));
        enemyGroup.addChild(new EnemyShip(this,200,90));
        enemyGroup.addChild(new EnemyShip(this,250,90));
        enemyGroup.addChild(new EnemyShip(this,350,90));
        
        gameScreen.addChild(enemyGroup);
        gameScreen.addChild(new MilleniumFalcon(this, 500, 700));
        gameScreen.display();
       
        //this.addObject(e1, 100,80);
        //this.addObject(e2, 150,90);
        //this.addObject(e3, 200,110);
        //this.addObject(e4, 250,120);
        
        //MilleniumFalcon mf = ;
        //this.addObject(mf, 500, 750);
        
    }
    
    private void scaleBackground() {
        GreenfootImage backgroundImage = getBackground();
        backgroundImage.scale(1000, 800);
        setBackground(backgroundImage);
    }
}

import greenfoot.GreenfootImage;
import greenfoot.World;
import greenfoot.*;

/**
 * Write a description of class GameWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class GameWorld extends World {

    /**
     * Constructor for objects of class GameWorld.
     */
    GameWorld(boolean multiPlayer) {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        scaleBackground();

        IComponent gameScreen = new Component();
        IComponent enemyGroup = new Component();

        Level level = new Level(500, 50);
        enemyGroup.addChildren(level.getEnemyTroops());

        gameScreen.addChild(level);
        gameScreen.addChild(enemyGroup);

        PlayerShip firstPlayer = new PlayerShip1(500, 700);

        if (multiPlayer) {
            firstPlayer = new PlayerShip1(550, 700);
            PlayerShip secondPlayer = new PlayerShip2(450, 700);
            ScoreBoard scoreBoardSecondPlayer = new ScoreBoard(750, 50);
            LifeGroup secondPlayerLifeGroup = new LifeGroup();
            secondPlayerLifeGroup.addChild(new Life(750, 750));
            secondPlayerLifeGroup.addChild(new Life(750, 720));
            secondPlayerLifeGroup.addChild(new Life(750, 690));
            secondPlayer.addHandler(scoreBoardSecondPlayer);
            secondPlayer.addHandler(secondPlayerLifeGroup);
            gameScreen.addChild(secondPlayer);
            gameScreen.addChild(scoreBoardSecondPlayer);
            gameScreen.addChild(secondPlayerLifeGroup);
        }

        ScoreBoard scoreBoardFirstPlayer = new ScoreBoard(50, 50);
        LifeGroup firstPlayerLifeGroup = new LifeGroup();
        firstPlayerLifeGroup.addChild(new Life(50, 750));
        firstPlayerLifeGroup.addChild(new Life(50, 720));
        firstPlayerLifeGroup.addChild(new Life(50, 690));
        firstPlayer.addHandler(scoreBoardFirstPlayer);
        firstPlayer.addHandler(firstPlayerLifeGroup);

        gameScreen.addChild(firstPlayer);
        gameScreen.addChild(scoreBoardFirstPlayer);
        gameScreen.addChild(firstPlayerLifeGroup);
        gameScreen.display(this);
        
    }
    
    public void gameOver()
    {
        Greenfoot.delay(20);
        Greenfoot.setWorld(new GameOver(10));
    }
    
    private void scaleBackground() {
        GreenfootImage backgroundImage = getBackground();
        backgroundImage.scale(1000, 800);
        setBackground(backgroundImage);
    }
}

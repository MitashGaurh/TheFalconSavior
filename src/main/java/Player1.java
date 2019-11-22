import greenfoot.Greenfoot;
import greenfoot.World;

/**
 * Write a description of class Player1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player1 extends Player {

    private boolean isShooting = false;

    private ScoreBoard scoreBoard;

    Player1(int x, int y) {
        super(x, y, LeafFactory.getLeafType("Player1", "millennium_falcon.png", null));
        scoreBoard = new ScoreBoard(30, 15);
    }

    public void control() {
        if (Greenfoot.isKeyDown("left")) {
            moveLeft();
        }

        if (Greenfoot.isKeyDown("right")) {
            moveRight();
        }

        if (Greenfoot.isKeyDown("space") && !isShooting) {
            shoot();
            isShooting = true;
        }

        if (!Greenfoot.isKeyDown("space") && isShooting) {
            isShooting = false;
        }

    }


    public void shoot() {
        Rocket temp = new Rocket(getX(), getY() - 10);
        IComponent rocket = new RocketDecorator(temp);
        temp.addObserver(scoreBoard);
        rocket.display(getWorld());
    }


    public void display(World world) {
        super.display(world);
        scoreBoard.display(world);
    }

    public int getScore() {
        return scoreBoard.score;
    }
}

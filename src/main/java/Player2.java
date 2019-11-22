import greenfoot.Greenfoot;
import greenfoot.World;

/**
 * Write a description of class Player2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player2 extends Player {

    private boolean isShooting = false;

    private ScoreBoard scoreBoard;

    Player2(int x, int y) {
        super(x, y, LeafFactory.getLeafType("Player2", "millennium_falcon.png", null));
        scoreBoard = new ScoreBoard(530, 15);

    }

    public void control() {
        if (Greenfoot.isKeyDown("a")) {
            moveLeft();
        }

        if (Greenfoot.isKeyDown("d")) {
            moveRight();
        }

        if (Greenfoot.isKeyDown("w") && !isShooting) {
            shoot();
            isShooting = true;
        }

        if (!Greenfoot.isKeyDown("w") && isShooting) {
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

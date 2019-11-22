import greenfoot.Greenfoot;

/**
 * Write a description of class millenium_falcon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MilleniumFalcon extends Leaf {
    /**
     * Act - do whatever the millenium_falcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean shooting = false;
    int count = 0;

    public MilleniumFalcon(int x, int y) {
        super(x, y, LeafFactory.getLeafType("MillenniumFalcon", "millennium_falcon.png", null));
    }

    public void act() {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")) {
            moveLeft();
        }

        if (Greenfoot.isKeyDown("right")) {
            moveRight();
        }

        if (Greenfoot.isKeyDown("space") && shooting == false && count == 0) {
            shoot();
            shooting = true;
            count = 40;
        }

        if (!Greenfoot.isKeyDown("space") && shooting == true) {
            shooting = false;
        }

        if (count > 0)
            count--;

    }

    public void moveLeft() {
        if (getX() - 10 > 0) {
            this.setLocation(getX() - 2, getY());
        }

    }

    public void moveRight() {
        if (getX() + 10 < this.getWorld().getWidth()) {
            this.setLocation(getX() + 2, getY());
        }

    }

    public void shoot() {
        IComponent rocket = new RocketDecorator(new Rocket(getX(), getY() - 10));
        rocket.display(getWorld());
    }
}
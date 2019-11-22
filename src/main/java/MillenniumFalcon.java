import greenfoot.Greenfoot;

/**
 * Write a description of class millenium_falcon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MillenniumFalcon extends Leaf {
    /**
     * Act - do whatever the millenium_falcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isShooting = false;
    private int count = 0;

    MillenniumFalcon(int x, int y) {
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

        if (Greenfoot.isKeyDown("space") && isShooting == false && count == 0) {
            shoot();
            isShooting = true;
            count = 40;
        }

        if (!Greenfoot.isKeyDown("space") && isShooting == true) {
            isShooting = false;
        }

        if (count > 0) count--;
    }

    private void moveLeft() {
        if (getX() - 10 > 0) {
            this.setLocation(getX() - 2, getY());
        }

    }

    private void moveRight() {
        if (getX() + 10 < this.getWorld().getWidth()) {
            this.setLocation(getX() + 2, getY());
        }
    }

    private void shoot() {
        IComponent rocket = new RocketDecorator(new Rocket(getX(), getY() - 10));
        rocket.display(getWorld());
    }
}
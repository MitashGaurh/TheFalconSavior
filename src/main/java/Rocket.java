/**
 * Write a description of class Rocket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rocket extends Leaf {
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Rocket(int x, int y) {
        super(x, y, LeafFactory.getLeafType("Rocket", "rocket.png", null));
        getImage().scale(10, 10);
    }

    public void act() {
        // Add your action code here.
        this.setLocation(getX(), getY() - 4);

        if (this.isTouching(EnemyShip.class)) {
            removeTouching(EnemyShip.class);
            inWorld = false;
            getWorld().removeObject(this);
        }

        if (inWorld && getY() <= 0) {
            getWorld().removeObject(this);
            inWorld = false;
        }
    }
}

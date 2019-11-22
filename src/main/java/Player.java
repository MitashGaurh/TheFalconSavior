/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Player extends Leaf {
    /**
     * Constructor for objects of class Player
     */
    public Player(int x, int y, LeafType leafType) {
        super(x, y, leafType);
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

    public void act() {
        control();
    }

    abstract public void control();

    abstract public void shoot();
}

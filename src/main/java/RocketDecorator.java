import greenfoot.World;

/**
 * Write a description of class RocketDecorator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RocketDecorator extends SoundDecorator {
    /**
     * Constructor for objects of class EnemyShipDecorator
     */
    RocketDecorator(IComponent component) {
        super(component);
    }

    public void enableSound() {
        component.enableSound();
    }

    public void display(World world) {
        enableSound();
        component.display(world);
    }
}

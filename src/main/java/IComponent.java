import greenfoot.World;

import java.util.List;

public interface IComponent {


    void addChild(IComponent component);

    void addChildren(List<IComponent> components);

    void enableSound();

    void display(World world);
}
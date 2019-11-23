import java.util.ArrayList;
import java.util.List;

public class Level1Strategy implements ILevelStrategy {

    public List<IComponent> getTroops() {
        ArrayList<IComponent> troop1 = new ArrayList<>();
        for (int y = 0; y < 2; y++) {
            for (int x = 1; x < 10; x++) {

                troop1.add(new EnemyShip1(1, 250 + ((x + 1) * 50), 150 + ((y + 1) * 50)));
            }
        }
        for (int y = 0; y < 2; y++) {
            for (int x = 1; x < 10; x++) {
                troop1.add(new EnemyShip2(-1, 250 + ((x + 1) * 50), 50 + ((y + 1) * 50)));
            }
        }
        return troop1;
    }
}

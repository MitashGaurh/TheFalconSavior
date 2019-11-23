/**
 * Write a description of class TwoLifeState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThreeLifeState implements ILifeState
{
    private ILifeStateMachine machine;

    ThreeLifeState(ILifeStateMachine m)
    {
        machine = m;
    }

    @Override
    public void gotHit() {
        machine.setStateTwoLifeState();
    }

    @Override
    public void powerUp() {

    }

    @Override
    public void gameOver() {

    }

}

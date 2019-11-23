/**
 * Write a description of class TwoLifeState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoLifeState implements ILifeState {
    ILifeStateMachine machine;

    public TwoLifeState(ILifeStateMachine m) {
        machine = m;
    }

    @Override
    public void gotHit() {
        machine.setStateOneLifeState();
    }

    @Override
    public void powerUp() {

    }

    @Override
    public void gameOver() {

    }

}

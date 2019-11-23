/**
 * Write a description of class OneLifeState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OneLifeState implements ILifeState {

    ILifeStateMachine machine;

    public OneLifeState(ILifeStateMachine m) {
        machine = m;
    }

    @Override
    public void gotHit() {
        this.gameOver();
    }

    @Override
    public void powerUp() {
        machine.setStateTwoLifeState();
    }

    @Override
    public void gameOver() {

        //Change screen

    }

}
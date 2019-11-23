/**
 * Write a description of class PlayerLifeStateMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayerLifeStateMachine implements ILifeStateMachine, IHitObserver {
    // instance variables - replace the example below with your own
    private OneLifeState oneLifeState;
    private TwoLifeState twoLifeState;
    private ThreeLifeState threeLifeState;
    private ILifeState currentLifeState;

    PlayerLifeStateMachine() {
        oneLifeState = new OneLifeState(this);
        twoLifeState = new TwoLifeState(this);
        threeLifeState = new ThreeLifeState(this);

        this.currentLifeState = threeLifeState;
    }

    @Override
    public void gotHit() {
        currentLifeState.gotHit();
    }

    @Override
    public void powerUp() {
        currentLifeState.powerUp();
    }

    @Override
    public void setStateOneLifeState() {
        currentLifeState = oneLifeState;
    }

    @Override
    public void setStateTwoLifeState() {
        currentLifeState = twoLifeState;
    }

    @Override
    public void setStateThreeLifeState() {
        currentLifeState = threeLifeState;
    }


    @Override
    public void hitEventUpdate() {
        this.gotHit();
    }
}

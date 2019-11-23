/**
 * Write a description of class LifeGroup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LifeGroup extends Component implements IPlayerEventHandler {
    private IPlayerEventHandler nextHandler;

    public boolean hasNext() {
        return null != this.nextHandler;
    }

    public IPlayerEventHandler getNext() {
        return this.nextHandler;
    }

    public void setNext(IPlayerEventHandler handler) {
        this.nextHandler = handler;
    }

    public void handleEvent(Event event) {
        if (event == Event.LIFE) {
            IComponent removedComponent = removeComponent();
            if (null != removedComponent && removedComponent instanceof Life) {
                ((Life) removedComponent).removeLife();
            }
        } else if (null != nextHandler) {
            this.nextHandler.handleEvent(event);
        }
    }
}

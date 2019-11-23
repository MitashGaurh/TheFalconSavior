public interface IHitSubject {

    void attach(IHitObserver obj);

    void notifyObserver();
}

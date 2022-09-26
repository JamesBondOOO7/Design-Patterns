package approach1;

public interface Subject {
    // Both of these methods take an Observer as argument
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    // This method is called to notify all Observers when the Subject's
    // state has changed
    public void notifyObservers();
}

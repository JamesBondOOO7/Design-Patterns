package approach1;

public interface Subject {
    // Both of these methods take an approach1.Observer as argument
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    // This method is called to notify all Observers when the approach1.Subject's
    // state has changed
    public void notifyObservers();
}

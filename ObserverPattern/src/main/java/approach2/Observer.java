package approach2;

public interface Observer {
    // whenever the state value (temp, humidity, pressure) changes,
    // update method will be called and the observer will ask for the
    // state variables in which they are interested in
    public void update();
}

package approach2;

public interface Observer {
    // (temp, humidity, pressure) :: state values the Observer
    // gets from the Subject when a weather measurement changes
    public void update();
}

package approach2;

public interface Observer {
    // (temp, humidity, pressure) :: state values the approach1.Observer
    // gets from the approach1.Subject when a weather measurement changes
    public void update();
}

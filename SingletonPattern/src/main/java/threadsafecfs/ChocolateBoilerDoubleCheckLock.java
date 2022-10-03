package threadsafecfs;

public class ChocolateBoilerDoubleCheckLock {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoilerDoubleCheckLock uniqueInstance;

    private ChocolateBoilerDoubleCheckLock() {
        empty = true;
        boiled = false;
    }

    // first check to see if an instance is created
    // we only synchronize the first time through, just what we want
    public static synchronized ChocolateBoilerDoubleCheckLock getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoilerDoubleCheckLock.class){
                System.out.println("Creating unique instance of Chocolate Boiler");
                uniqueInstance = new ChocolateBoilerDoubleCheckLock();
            }
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}



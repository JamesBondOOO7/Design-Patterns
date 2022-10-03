package threadsafecfs;

public class ChocolateBoilerSync {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerSync uniqueInstance;

    private ChocolateBoilerSync() {
        empty = true;
        boiled = false;
    }

    // ensures `uniqueInstance` creation by just 1 thread only, for the first time
    public static synchronized ChocolateBoilerSync getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoilerSync();
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

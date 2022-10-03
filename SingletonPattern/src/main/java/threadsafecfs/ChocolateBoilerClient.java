package threadsafecfs;

public class ChocolateBoilerClient {
    public static void main(String[] args) {

        ChocolateBoilerSync cbs = ChocolateBoilerSync.getInstance();
        ChocolateBoilerEagerInit cbei = ChocolateBoilerEagerInit.getInstance();
        ChocolateBoilerDoubleCheckLock cbdcl = ChocolateBoilerDoubleCheckLock.getInstance();

    }
}

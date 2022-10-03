package chocoenum;

public class ChocoHolicClient {
    public static void main(String[] args) {
        ChocoHolic chocoHolic = ChocoHolic.UNIQUE_INSTANCE;
        chocoHolic.fill();
        System.out.println(chocoHolic.isEmpty());
        chocoHolic.boil();
        chocoHolic.drain();
        System.out.println(chocoHolic.isBoiled());
    }
}

package pizzafactorypattern;

public class NYPizzaStore extends PizzaStore {

    /*
    Implements the factory method
    models to a concrete object based on conditions at RUNTIME
     */
    @Override
    protected Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }
}

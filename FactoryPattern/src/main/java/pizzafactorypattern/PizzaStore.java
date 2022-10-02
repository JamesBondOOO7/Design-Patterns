package pizzafactorypattern;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /*
    Factory method
    This method needs to be implemented by the child class
     */
    protected abstract Pizza createPizza(String type);
}

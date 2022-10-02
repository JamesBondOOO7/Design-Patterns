package pizzafactorywithingredients;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        // The NYStore is composed with a NY pizza ingredient factory
        // This will be to produce the ingredients for all NY-style pizzas
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        // For each type of pizza, we instantiate a new Pizza and give it
        // the factory it needs to get its ingredients
        switch (item) {
            // We now pass each pizza, the factory that should be used to
            // produce its ingredients
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
        }
        return pizza;

    }
}

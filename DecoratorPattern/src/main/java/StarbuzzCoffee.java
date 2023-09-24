public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());

        // by default, size is tall
        Beverage beverage2 = new DarkRoast();  // cost = 0.99
        beverage2 = new Mocha(beverage2);  // cost = 0.99 + 0.30 = 1.29
        beverage2 = new Mocha(beverage2);  // cost = 1.29 + 0.30 = 1.59
        beverage2 = new Whip(beverage2);  // cost = 1.59 + 0.15(tall) = 1.74
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
        beverage2.setSize(Size.GRANDE);  // notice : only whip size will be set to GRANDE
        /*  Hence, only cost for whip changes, rest remain the same.
            cost = 1.59 + 0.20(grande) = 1.79
            So if we want to increase some other condiment, we would have to do it explicitly
            and then add it to the other condiment constructor
         */
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());

    }
}

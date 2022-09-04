public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double sizeCost = switch (this.size) {
            case TALL -> 0.10;
            case GRANDE -> 0.15;
            case VENTI -> 0.20;
        };

        return beverage.cost() + 0.15 + sizeCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}

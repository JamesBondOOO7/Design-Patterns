public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double sizeCost = switch (this.size) {
            case TALL -> 0.05;
            case GRANDE -> 0.10;
            case VENTI -> 0.15;
        };
        return beverage.cost() + 0.10 + sizeCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}

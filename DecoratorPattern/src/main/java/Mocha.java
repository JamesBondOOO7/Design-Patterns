// Mocha is a decorator, so we extend Condiment Decorator
// and CondimentDecorator extends Beverage
public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double sizeCost = switch (this.size) {
            case TALL -> 0.10;
            case GRANDE -> 0.20;
            case VENTI -> 0.30;
        };
        return beverage.cost() + 0.20 + sizeCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}

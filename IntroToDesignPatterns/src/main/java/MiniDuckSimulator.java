import duckOff.Duck;
import duckOff.FlyRocketPowered;
import duckOff.MallardDuck;
import duckOff.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        /*
            Think About why model.performFly() works?
            Duck --> ModelDuck
            Duck has `flyBehaviour` instance variable (which is referencing an Interface)
            ModelDuck is extending Duck, hence it also has it.
            It sets the `flyBehaviour` to `FlyNoWay` object
                - Note: flyBehaviour is an interface type
                - while, FlyNoWay is a class implementing that Interface
         */
        model.performFly();
        /*
            Changing the flyBehaviour!
            We have used a setter method in the Duck(Parent) class, which can change
            the flyBehaviour

            ==> Dynamically changing the flying behaviour!!!
            ( means, flyBehaviour can be changed during runtime )
         */
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}

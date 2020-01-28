import client.*;
import fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();

        Duck redHead = new RedheadDuck();
        redHead.display();
        redHead.performQuack();
        redHead.performFly();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();
    }
}

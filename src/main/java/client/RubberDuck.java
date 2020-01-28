package client;

import fly.FlyNoWay;
import quack.QuackBehavior;
import quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("looks like a rubber duck");
    }

}

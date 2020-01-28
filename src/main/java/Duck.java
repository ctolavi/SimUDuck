abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    void swim() {
        System.out.println("swim");
    }

    void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    abstract void display();

}

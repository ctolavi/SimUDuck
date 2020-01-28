public class DecoyDuck extends Duck {

    @Override
    void quack() {
        //do nothing
    }

    @Override
    void fly() {
        //do nothing
    }

    void display() {
        System.out.println("looks like a decoy duck");
    }
}

public class RubberDuck extends Duck implements QuackBehavior {

    void display() {
        System.out.println("looks like a rubberduck");
    }

    public void quack() {
        System.out.println("quack like a rubberduck");
    }
}

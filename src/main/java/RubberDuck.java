public class RubberDuck extends Duck implements QuackBehavior {

    public void display() {
        System.out.println("looks like a rubberduck");
    }

    public void quack() {
        System.out.println("quack like a rubberduck");
    }
}

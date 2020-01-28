public class MallardDuck extends Duck implements Flyable, Quackable{

    void display() {
        System.out.println("looks like a mallard");
    }

    public void fly() {
        System.out.println("fly like a MalllardDuck");
    }

    public void quack() {
        System.out.println("quack like a MalllardDuck");
    }
}

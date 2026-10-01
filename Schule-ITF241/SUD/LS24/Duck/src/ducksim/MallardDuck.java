package ducksim;
public class MallardDuck extends Duck {
    public MallardDuck(String name){
        super(name);
        this.flyBehavior = new WingFlapping(5.0, 1.2);
        this.quackBehavior = new Quack();
    }
    public void display(){ System.out.println("I'm a Mallard named " + name); }
}

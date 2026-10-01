package ducksim;
public class RubberDuck extends Duck {
    public RubberDuck(String name){
        super(name);
        this.flyBehavior = new NotFlying();
        this.quackBehavior = new Squeak();
    }
    public void display(){ System.out.println("I'm a RubberDuck named " + name); }
}

package ducksim;
public class ModelDuck extends Duck {
    public ModelDuck(String name){
        super(name);
        this.flyBehavior = new NotFlying();
        this.quackBehavior = new Quack();
    }
    public void display(){ System.out.println("I'm a ModelDuck named " + name); }
}

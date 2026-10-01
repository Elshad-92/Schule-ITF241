package ducksim;
public abstract class Duck {
    protected String name;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public Duck(String name) { this.name = name; }
    public void performFly(){ if(flyBehavior!=null) flyBehavior.fly(); }
    public void performQuack(){ if(quackBehavior!=null) quackBehavior.quack(); }
    public void setFlyBehavior(FlyBehavior fb){ this.flyBehavior = fb; }
    public void setQuackBehavior(QuackBehavior qb){ this.quackBehavior = qb; }
    public void swim(){ System.out.println(name + " is swimming."); }
    public abstract void display();
}

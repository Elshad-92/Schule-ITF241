import ducksim.*;
public class Main {
  public static void main(String[] args){
    ducksim.Duck mallard = new ducksim.MallardDuck("Mallard");
    ducksim.Duck rubber = new ducksim.RubberDuck("Rubber");
    ducksim.Duck model = new ducksim.ModelDuck("Model");

    System.out.println("=== Round 1 ===");
    mallard.display(); mallard.performQuack(); mallard.performFly();
    System.out.println();
    rubber.display(); rubber.performQuack(); rubber.performFly();
    System.out.println();
    model.display(); model.performQuack(); model.performFly();

    System.out.println("\nChanging ModelDuck behavior to rocket and hoarse quack.");
    model.setFlyBehavior(new ducksim.FlyRocketPowered());
    model.setQuackBehavior(new ducksim.HoarseQuack());

    System.out.println("\n=== Round 2 ===");
    model.display(); model.performQuack(); model.performFly();
  }
}

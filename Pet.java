public class Pet
{
  // instance variables
  private String species;
  private String name;
  private int age;
  private double weight;
  private boolean isHungry;
  private boolean isSleeping;

  // zero argument constructor
  public Pet()
  {
    species = "dog";
    name = "Fiddo";
    age = 3;
    weight = 50.0;
    isHungry = true;
    isSleeping = false;
  }

  // 6 argument constructor
  public Pet(String s, String n, int a, double w, boolean h, boolean sl)
  {
    this.species = s;
    this.name = n;
    this.age = a;
    this.weight = w;
    this.isHungry = h;
    this.isSleeping = sl;
  }

  // go to sleep method
  public void sleep()
  {
    this.isSleeping = true;
    System.out.println(this.name + " is now sleeping!");
  }

  // wake up method
  public void wakeUp()
  {
    this.isSleeping = false;
    System.out.println(this.name + " is now awake!");
  }

  // aging method
  public void aging(int yearsGrown)
  {
    this.age += yearsGrown;
    System.out.println(this.name + " is now " + this.age + " years old.");
  }

  // change weight method
  public void changeWeight(double weight)
  {
    this.weight += weight;
    System.out.println(this.name + " is now " + this.weight + " pounds.");
  }

  // overriding the toString method
  @Override
  public String toString()
  {
    return "Species: " + this.species + "\n" +
            "Name: " + this.name + "\n" +
            "Age: " + this.age + "\n" +
            "Weight: " + this.weight + "\n" +
            "Are they hungry? " + this.isHungry + "\n" +
            "Are they sleeping? " + this.isSleeping;
  }
}
package Class_Object;

public class Hierarchial {
  public static void main(String[] args) {
    Bird parrot = new Bird();
    parrot.fly();
    parrot.eat();
    parrot.breathe();
  }
}
class Animal{
  String color;
  void eat(){
    System.out.println("Eats");
  }
  void breathe(){
    System.out.println("breathe");
  }
}
class Fish extends Animal{
  void swims(){
    System.out.println("Swims");
  }
}
class Bird extends Animal{
  void fly(){
    System.out.println("Fly");
  }
}
class Mammal extends Animal{
  void walk(){
    System.out.println("walks");
  }
}

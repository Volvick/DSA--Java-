package Class_Object;

public class Inheritance {
  public static void main(String[] args) {
    Fish shark = new Fish();
    shark.eat();
    shark.fins = 10;
    shark.color = "yellow";
    System.out.println(shark.color);
    shark.swims();
  }
}
//parent class
class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breathe() {
    System.out.println("breathe");
  }
}
//child class
class Fish extends Animal {
  int fins;

  void swims() {
    System.out.println("swims in water");
  }
}

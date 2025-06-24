package Class_Object;

public class Abstraction {
  public static void main(String[] args) {
    Chicken c1 = new Chicken();
  }
}

abstract class Animal {
  String color;

  Animal() {
    System.out.println("Animal constructor is called");
  }

  void eat() {
    System.out.println("eat");
  }

  abstract void walk();
}

class Horse extends Animal {
  Horse() {
    System.out.println("Horse contructor is called");
  }

  void changeColor() {
    color = "Dark brown";
  }

  void walk() {
    System.out.println("walk on 4 legs ");
  }
}

class Chicken extends Horse {
  Chicken() {
    System.out.println("Chicken contructor is called");
  }

  void walk() {
    System.out.println("walk on 2 legs");
  }
}

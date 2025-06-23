package Class_Object;

public class MultiLevelInheritance {
  public static void main(String[] args) {
    Dog rocky = new Dog();
    rocky.eats();
    rocky.breathe();
    rocky.legs = 4;
    System.out.println(rocky.legs);
  }
}

class Animal {
  String color;

  void eats() {
    System.out.println("eat");
  }

  void breathe() {
    System.out.println("breathe");
  }
}

class Mammal extends Animal {
  int legs;
}

class Dog extends Mammal {
  String breed;
}

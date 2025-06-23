package Class_Object;

public class Hybrid {
  public static void main(String[] args) {
    Peacock p1 = new Peacock();
    p1.peacock();
    Dog d1 = new Dog();
    d1.dog();
    d1.walk();
    d1.eat();
  }
}
class Animal{
  String color;

  void eat(){
    System.out.println("eat");
  }
  void breathe(){
    System.out.println("breathe");
  }
}
class Fish extends Animal{
  void swim(){
    System.out.println("swim");
  }
}
class Bird extends Animal{
  void fly(){
    System.out.println("Fly");
  }
}
class Mammal extends Animal{
  void walk(){
    System.out.println("walk");
  }
}
class Tuna extends Fish{
  void tuna(){
    System.out.println("tuna");
  }
}
class Shark extends Fish{
  void shark(){
    System.out.println("shark");
  }
}
class Peacock extends Bird{
  void peacock(){
    System.out.println("peacock");
  }
}
class Dog extends Mammal{
  void dog(){
    System.out.println("dog");
  }
}
class Human extends Mammal{
  void human(){
    System.out.println("human");
  }
}

package Class_Object;


public class Overriding{
  public static void main(String[] args) {
    Deer d1 = new Deer();
    d1.eats();
  }
}
class Animall{
  void eats(){
    System.out.println("eats anything");
  }
}
class Deer extends Animall{
  void eats(){
    System.out.println("eats grass");
  }
}

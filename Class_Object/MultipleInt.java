package Class_Object;

public class MultipleInt {
  public static void main(String[] args) {
    Bear b1 = new Bear();
  }
}
interface carnivore{
  void carni();
}
interface herbivore{
  void herbi();
}
class Bear implements carnivore,herbivore{
  public Bear(){
    carni();
    herbi();
  }
  public void carni(){
    System.out.println("eats meat");
  }
  public void herbi(){
    System.out.println("Eats grass");
  }
}

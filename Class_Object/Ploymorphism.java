package Class_Object;

public class Ploymorphism {
  public static void main(String[] args) {
    Calculator call = new Calculator();
    call.sum(10, 10);
    call.sum(20, 100,20);
    call.sum(2.0f, 2.0f,4.0f);
  }
}
//overloading
class Calculator {
  void sum(int a,int b){
    System.out.println(a+b);
  }
  void sum(int a, int b, int c) {
    System.out.println(a + b + c);
  }
  void sum(float a,float b,float c){
    System.out.println(a+b+c);
  }
}

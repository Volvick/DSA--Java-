package Class_Object;

public class OOPS {
  public static void main(String[] args) {
    Pen p1 = new Pen();// created a pen object called p1;
    p1.setColor("Blue");
    System.out.println(p1.color);
    Student s1 = new Student();
    s1.age = 10;
    System.out.println(s1.age);
    s1.clacPercentage(90, 95, 99);
    System.out.println(s1.percentage);
    bankAccount myAccount = new bankAccount();
    myAccount.userName = "Volvick";
    myAccount.setPassword("34ds!e21");
    System.out.println(myAccount.userName);
  }

}
class bankAccount{
  public String userName;
  private String password;
  void setPassword(String newPass){
    password = newPass;
  }
}

class Pen {
  String color;
  int tip;

  void setColor(String newColor) {
    color = newColor;
  }

  void setTip(int newTip) {
    tip = newTip;
  }
}

class Student {
  String name;
  int age;
  float percentage;

  void clacPercentage(int phy, int chem, int math) {
    percentage = (phy + chem + math) / 3;
  }
}

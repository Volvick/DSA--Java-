package Class_Object;

public class StaticKeyword {
  public static void main(String[] args) {
    Student s1 = new Student();

    System.out.println(s1.returnPercentage(100, 93, 94));
    s1.schoolname = "SJS";
    s1.setName("Volvick");
    System.out.println(s1.getName());
    System.out.println(s1.schoolname);
  }
}

class Student {
  static int returnPercentage(int phy,int chem,int math){
    return (phy+math+chem)/3;
  }
  String name;
  int rollno;
  static String schoolname;

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }
}

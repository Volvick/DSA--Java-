package Class_Object;

public class constructor {
  public static void main(String[] args) {
    Student s1 = new Student();                  // prints: Default constructor
    Student s2 = new Student("Volvick");         // prints: Name: Volvick
    Student s3 = new Student(50);                // prints: Roll: 50
  }
}

class Student {
  String name;
  int roll;

  Student() {
    System.out.println("Default constructor");
  }

  Student(String name) {
    this.name = name;
    System.out.println("Name: " + name);
  }

  Student(int roll) {
    this.roll = roll;
    System.out.println("Roll: " + roll);
  }
}

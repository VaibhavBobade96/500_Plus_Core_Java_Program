import java.util.*;

class student{
 
  int id;
  String name;

  student(int x, String y)
  {
    id = x ;
    name = y;
  }

  void display()
  {
    System.out.println("Student Id: "+id);
    System.out.println("Student Name: "+name);
  }

}

public class Constructor2Parameterized{
 
  public static void main(String[] args){

  student s1 = new student(101, "vaibhav");
  student s2 = new student(102, "Rahul");

  s1.display();
  s2.display();

 }

}




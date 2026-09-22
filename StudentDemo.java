import java.util.*;

class Student{
 
  String name ;
  int age;
  int id;

   void display()
   {
     System.out.println("name :"+name);
     System.out.println("Age :"+age);
     System.out.println("ID :"+id);

  }

}

  public class StudentDemo{

  public static void main(String[] args){

    Student s = new Student();

    s.name = "Vaibhav";
    s.age = 22;
    s.id = 101;

	s.display();

  }

}

 
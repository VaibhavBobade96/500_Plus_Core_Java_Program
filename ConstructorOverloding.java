
// Constructor overloading

import java.util.*;

class student{
  
  int id ;
  String name;
  int age;
 
   student() // Zeror parameter
   { 
     id = 0;
     name = "unknown";
     age = 0;

   }

   student(int x) // 1 parameter
   {
     id = x;
     name = "unknown";
     age = 0;

   }

   student(int x, String y) // 2 parameter
   {
      id = x;
      name = y;
      age = 0;
   }

   student(int x, String y, int z) // 3 parameter
   {
      id = x;
      name = y;
      age = z;

   }

   void display()
   {
     System.out.println("id : " +id);
     System.out.println("name : " +name);
     System.out.println("age : " +age);
	 System.out.println();

  }

}

public class ConstructorOverloding{

  public static void main(String[] args){

   student s = new student();
   student s1 = new student(101);
   student s2 = new student(101, "Vaibhav");
   student s3 = new student(101, "vaibhav", 22);

   s.display();
   s1.display();
   s2.display();
   s3.display();

 }

}
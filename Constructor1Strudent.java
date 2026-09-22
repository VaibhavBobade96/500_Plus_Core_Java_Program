import java.util.*;

class student{

  int id;
  String name;


// Default Constructor 
   student()
   {
     id = 101;
     name = "Vaibhav";
	 System.out.println("Student Id :" +id);
     System.out.println("Student name :" +name);

   }

   void display()
   {
     System.out.println("Student Id :" +id);
     System.out.println("Student name :" +name);

   }

 }

 public class Constructor1Strudent{

   public static void main(String[] args){

   student s = new student();

   s.display();

  }

}
//Static Block

public class StaticBlock3{
 
  static int id;
  static String name;
  static int age;
   
   static
   {
     id = 101;
     name = "Vaibhav";
     age = 22;

   }

   public static void main(String[] args){

    System.out.println(id);
    System.out.println(name);
    System.out.println(age);

 }

}
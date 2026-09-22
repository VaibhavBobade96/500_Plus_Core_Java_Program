//Encapsulation
public class Encapsulation1Demo{
  
   private String name;
   private int age;

   void setData(String x, int y)
   {
     name = x;
     age = y;
   }

   void display()
   {
      System.out.println("Print Name :" +name);
      System.out.println("Print Age :" +age);
   }

   public static void main(String[] args)
   {
     Encapsulation1Demo e = new Encapsulation1Demo();
     e.setData("Vaibhav", 101);
     e.display();
   }

}


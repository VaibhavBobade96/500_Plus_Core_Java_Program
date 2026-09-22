//Static Block 

public class StaticBlock4{
 
 static int id;
 static String name;
 static int age;

    static 
    {
      id = 101;
      name = "Vaibhav";
      age = 22;
      System.out.println(" Satic Block is used to initialize the Static Variable ");
      System.out.println("ID :" +id);
      System.out.println("Name :"+name);
      System.out.println("Age :"+age);

    }

 public static void main(String[] args)
 {
    System.out.println("Main Method");
 }

}

 
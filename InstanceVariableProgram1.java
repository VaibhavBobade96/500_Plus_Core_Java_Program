//Instance variable

public class InstanceVariableProgram1{

  String name = "Vaibhav";
  int age = 21;

  void display()
  {
    System.out.println("Name : " +name);
    System.out.println("Age :" +age);

  }


  public static void main(String[] args)
  {
     InstanceVariableProgram1 i = new InstanceVariableProgram1();

     i.display();

  }

}

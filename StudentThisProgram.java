//This keyword with instance variable 

public class StudentThisProgram{
 
  int id;
  String name;

  StudentThisProgram(int id, String name)
  {
    this.id = id;
    this.name = name;
  }

  void display()
  {
    System.out.println("print id :"+id);
    System.out.println("print name :"+name);
  }

  public static void main(String[] args){

   StudentThisProgram s = new StudentThisProgram(101, "vaibhav");
   s.display();

  }

}
  
  
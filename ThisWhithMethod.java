// this keyword with method is used to call the the current class method 

public class ThisWhithMethod{
  
   void display()
   {
     System.out.println("This with method is used to call the current class method");
   }

    ThisWhithMethod()
   {
     this.display();
   }

  public static void main(String[] args)
  {
    ThisWhithMethod t = new ThisWhithMethod();
  }
  
}
    
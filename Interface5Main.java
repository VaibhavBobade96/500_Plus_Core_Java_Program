interface shape
{
    void AreaOfCircle();

   default void display()
    {
      System.out.println("Calculate the Area of Circle");
    }

}

class circle implements shape
{
  public void AreaOfCircle()
   {
      int r = 5;

      System.out.println("Area :" +3.14 * r * r);
    
   }

}

public class Interface5Main
{
  public static void main(String[] args){

  circle c = new circle();
  c.AreaOfCircle();
  c.display();

 }

}
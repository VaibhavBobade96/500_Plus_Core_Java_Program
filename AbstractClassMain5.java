abstract class shape{

   abstract void area();

}

class circle extends shape{

   void area()
   {
     int r = 5;

     System.out.println("Area of Circle :"+3.14*r*r);

  }

}

public class AbstractClassMain5{

  public static void main(String[] args){

   circle c = new circle();
   c.area();

 }

}
interface vehical
{
   void start();

}

class car implements vehical{

   public  void start()
    {
      System.out.println("Car Started");
    }
   


}

public class interfaceMain2{

 public static void main(String[] args){

  car c = new car();
  c.start();
 
 }

}
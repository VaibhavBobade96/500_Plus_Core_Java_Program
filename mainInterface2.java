
interface vehical
{
  void start();
}

class Car implements vehical
{
   public void start()
   {
     System.out.println("Car Starts with key...");
   }
}
 
class bike implements vehical
{
   public void start()
   {
     System.out.println("Bike Starts with key....");

    }
 }

 public class mainInterface2{
  
  public static void main(String[] args){

  Car c = new Car();
  bike b = new bike();

  c.start();
  b.start();

  }

}
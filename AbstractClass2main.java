abstract class vehicle
{
  abstract void start();

  void stop()
  {
    System.out.println("Vehicle Stops");
  }

}

class car extends vehicle {

  void start()
  {
    System.out.println("Car Starts");
  }

}

public class AbstractClass2main
{
  public static void main(String[] args){

    car c = new car();

    c.start();
    c.stop();
 }

}
import java.util.*;

class car{
 
  String name ;
  String color;
  int speed;


    void start()
    {
       System.out.println(" Car Started..");
     }

     void Accelerator()
     {
        speed = speed + 20;

	System.out.println("Speed :" +speed);
     }
    
	void CarDetails()
	{
	  System.out.println();
	  System.out.println("Car Name :" +name);
	  System.out.println("Car Color :" +color);
	  System.out.println("Car Speed :" +speed);
	}

  }

public class CarDemo{

  public static void main(String[] args){

   car c = new car();

   c.name = "Brezza";
   c.color = "White";
   c.speed = 60;

   c.start();
   c.Accelerator();
   c.CarDetails();

   }

 }



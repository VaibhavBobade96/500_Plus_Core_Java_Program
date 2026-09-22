//Inheritance

class Animal 
{
   void eat()
   {
     System.out.println("Animall Eating...");
   }

}

class dog extends Animal
{

  void bark()
  {
    System.out.println("Dog Barking..");
  }
}

public class InterfaceDemo{

  public static void main(String[] args){

  dog d = new dog();

  d.bark();
  d.eat();

 }


}


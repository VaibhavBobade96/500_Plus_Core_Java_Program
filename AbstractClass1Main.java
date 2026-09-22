abstract class Animal{

  abstract void sound();

  void eat()
  {
    System.out.println("Animal Eats");

  }

 }

 class Dog extends Animal{

   void sound()
   {
     System.out.println("Dog barks");
   }

 }

 public class AbstractClass1Main{

   public static void main(String[] args){

     Dog d = new Dog();

     d.sound();
     d.eat();

  }

}
    

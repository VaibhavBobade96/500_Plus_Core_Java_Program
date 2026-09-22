//Hierarchical inheritance

class Animal
{
   void eat()
   {
     System.out.println("Animal Eating...");
   }
}

class dog extends Animal
{
   void bark()
   {
     System.out.println("Dog is barking..");
   }

}

class cat extends Animal
{
   void meow()
   {
     System.out.println("Cat meowing..");
   }
 
 }

 public class HierarchicalInheritance{
  
    public static void main(String[] args){

    cat c = new cat();

    c.meow();
    c.eat();

	dog d = new dog();
	d.bark();

    
    }

}
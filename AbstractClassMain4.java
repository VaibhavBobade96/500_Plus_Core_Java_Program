abstract class Employee
{
   abstract void salary();

   void work()
   {
     System.out.println("Employee Working");

   }

}
class Developer extends Employee
{
   void salary()
   {
      System.out.println("Emplyee Salary is : 50000");
   }


}

public class AbstractClassMain4{

 public static void main(String[] args){

   Developer d = new Developer();

   d.salary();
   d.work();

 }

}
   
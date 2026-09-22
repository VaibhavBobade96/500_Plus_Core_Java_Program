interface Employee
{
   void salary();

   default void working()
   {
      System.out.println("Employee working..");
   }

}

class developer implements Employee
{
    public void salary()
    {
      System.out.println("Employee Salary is 5000");
    }

}



public class interface4main{
   
   public static void main(String[] args){

   developer d = new developer();
    
     d.salary(); 
     d.working();

   }

}
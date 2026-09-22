//Single inheritance

class employee
{
    void salary()
    {
      System.out.println("Employee Salary....");
    }
}

class developer extends employee
{
   
   void working()
   {
     System.out.println("developer Working....");
   }

}

public class SingleInheritance01{

 public static void main(String[] args){

  
   developer e = new developer();

   e.salary();
   e.working();

 }

}

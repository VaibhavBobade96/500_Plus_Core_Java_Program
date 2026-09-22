// this with different variables 

public class employeeThisprogram{

   String name;
   double salary;

   employeeThisprogram(String x, double y)
   {
      name = x;
      salary = y;
   }

   void display()
   {
     System.out.println("Print name : "+name);
     System.out.println("Print salary: "+salary);
  }

  public static void main(String[] args)
  {
    employeeThisprogram e = new employeeThisprogram("Vaibhav", 25000);
    e.display();
  }

}

 



   
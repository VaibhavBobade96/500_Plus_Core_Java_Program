import java.util.*;

class employee{
 
  int id ;
  String name;
  double salary;
  double bonus;

  double TotalSalary;

  void display()
  {
    TotalSalary = salary + bonus;

    System.out.println("id :" +id);
    System.out.println("name :" +name);
    System.out.println("Salary: "+salary);
    System.out.println("Bonus: "+bonus);
    System.out.println();
    System.out.println("Total Salry :" +TotalSalary);
  
    }
  }

  public class EmployeeDetails{

  public static void main(String[] args){

  employee e = new employee();

  e.id = 101;
  e.name = "Vaibhav";
  e.salary = 50000;
  e.bonus = 5000;

  e.display();

 }

}

public class MethodOverloading3{

  void get(int a, String b)
  {
    System.out.println("name And id ");
    System.out.println("Name of Student :"+b);
    System.out.println("Id of Student :"+a);
   }

   void get(int a, String b, double salary)
   {
     System.out.println("name, id and salary");
     System.out.println("Name of Student :" +b);
     System.out.println("Id of Student :"+a);
	 System.out.println("Salary of Student:" +salary);
   }

   public static void main(String[] args){

   MethodOverloading3 m = new MethodOverloading3();
   m.get(101, "VAibhav");
   System.out.println();
   m.get(101, "Vaibhav", 35000);
   System.out.println();

  }

}
public class MethodOverloading5{

  void get(int a, String b)
  {
    System.out.println("name And id ");
    System.out.println("Name of Student :"+b);
    System.out.println("Id of Student :"+a);
   }

   void get( String b, int a)
   {
     System.out.println("name, id and salary");
     System.out.println("Name of Student :" +b);
     System.out.println("Id of Student :"+a);
	 
   }

   public static void main(String[] args){

   MethodOverloading5 m = new MethodOverloading5();
   m.get(101, "VAibhav");
   System.out.println();
   m.get("Vaibhav", 543);
   System.out.println();

  }

}
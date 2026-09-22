public class MethodOverloading4{
  
   void show(int a)
   {
     System.out.println("Value of a :" +a);
   }

   void show(String name)
   {
     System.out.println("Vlue of name :"+name );
   }

   void show(double salary)
   {
     System.out.println("Value of salary:"+salary);
   }

   public static void main(String[] args){

   MethodOverloading4 m = new MethodOverloading4();
   m.show(2);
   m.show("Vaibhav");
   m.show(534.3434);

   }

 }

 
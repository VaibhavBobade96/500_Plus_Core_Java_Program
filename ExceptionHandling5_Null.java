// NullPointerException

public class ExceptionHandling5_Null{

 public static void main(String[] args){

  try{

      String str = null;

      System.out.println(str.length());

      }

   catch(NullPointerException e1)
   {
     System.out.println("Object is Null..");
   }

   System.out.println("program Continue...");

  }

 }
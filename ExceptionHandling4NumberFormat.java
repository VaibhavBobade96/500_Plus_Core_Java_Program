//NumberFormatException

public class ExceptionHandling4NumberFormat{

  public static void main(String[] args){

   try{

       String str = "Vaibhav";
       int num = Integer.parseInt(str);

       System.out.println(num);
      
      }

   catch( NumberFormatException e)
   {
     System.out.println("invalid Number Format");
   }

 }

}
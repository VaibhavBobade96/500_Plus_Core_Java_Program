import java.util.Scanner;

public class ExceptionHandling3{

   public static void main(String args[]){

     try{

        String name = null;

	    System.out.println(name.length());

	}

   catch(NullPointerException e)
   {
      System.out.println("String is Null");
    }

  }

}
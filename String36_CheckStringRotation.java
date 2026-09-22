//Check two strings rotation

public class String36_CheckStringRotation{

   public static void main(String[] args){

   String name1 = "abcd";
   String name2 = "cdab";

  /* if(name1.length() == name2.length() && (name1 + name1).contains(name2))
    {
      System.out.println("String are rotation");
    }
    else{
         System.out.println("String are not rotation");
        }*/

	String	result = name1 + name1;

		System.out.println(result.contains(name2));

  }

 }
    
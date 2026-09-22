//Compare two strings


public class String4_CompareTwoString{

    public static void main(String[] args){

     String name1 = "Vaibhav";
     String name2 = "vaibhav";

     boolean compare = name1.equals(name2);

     System.out.println(compare);

	 if(compare == true)
		{
		  System.out.println(" Both strings are equals");
		}

	else{

		System.out.println(" Both Strings are not equals");
	}

    }

 }

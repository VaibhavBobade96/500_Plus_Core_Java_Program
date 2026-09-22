// this with constructor current class constructor ko initialize karna

public class ThisWithConstuctor{
 
    ThisWithConstuctor()
    {
	   this(22);
    
      System.out.println(" Default Constructor ");
	  System.out.println();
	}

    ThisWithConstuctor(int age)
    {
       this(101, "vaibhav");
      System.out.println("Print age :"+age);
	  System.out.println();

    }

	ThisWithConstuctor(int id, String name)
	{
	   System.out.println("Pring Id :" +id);
	   System.out.println("Print Name:"+name);
	}

   public static void main(String[] args)
   {
     ThisWithConstuctor t = new ThisWithConstuctor();
   }

 }

   
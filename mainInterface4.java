
interface father
{
   void property();

}

interface mother
{
   
  void education();

}

class child implements father, mother
{
  
 public void property()
   {
      System.out.println("Father gives the property...");
    }

  public void education()
    {
       System.out.println("Mother Provides the education....");
     
    }
 }

 public class mainInterface4{

    public static void main(String[] args){

     child c1 = new child();
     c1.property();
     c1.education();

    }

}


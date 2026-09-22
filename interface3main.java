interface bank
{
   void rateOfInterest();

 }

 class Interest implements bank{

     public void rateOfInterest()
     {
        System.out.println("The SBI bank rate of interest is 7 percents");
     }

 }


 public class interface3main{

  public static void main(String[] args){

 Interest i = new Interest();

 i.rateOfInterest();

 }

}


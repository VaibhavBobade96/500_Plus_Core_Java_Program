abstract class Bank
{
   abstract void rateOfInterest();

}
  class SBI extends Bank{

   void rateOfInterest()
   {
     System.out.println("SBI rate of Interest is 7%");
   }

 }

 public class AbstractClass3main{
  
  public static void main(String[] args){

  SBI s = new SBI();
  s.rateOfInterest();
 
 }

}
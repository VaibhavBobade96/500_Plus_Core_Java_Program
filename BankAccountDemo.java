import java.util.*;

class BankAccount{

   int acount_no;
   String name;
   Double Balance;
   

   void Diposit(double amount){

      Balance = Balance + amount;
     System.out.println("Total Balance :" +Balance);

    }

    void Withdrowal(double amount)
    {
      if(amount<Balance)
      {
       Balance = Balance - amount;

	System.out.println(" Remaining Balance :" +Balance);
      } 
       else{
        
	 System.out.println("Insufficient Balance....");
      }
 }

   void displayDetails()
	{
	  System.out.println();
	  System.out.println(" Account Number :" +acount_no);
	  System.out.println(" Holder name : " +name);
	  System.out.println(" Balance : " +Balance);
	}



}

 public class BankAccountDemo{
  
  public static void main(String[] args){

  BankAccount bank = new BankAccount();

  bank.acount_no = 57498934;
  bank.name = "Vaibhav";
  bank.Balance = 50000.0;
  
  bank.Diposit(5000);
  bank.Withdrowal(10000);
  bank.displayDetails();

  }

}

 


 
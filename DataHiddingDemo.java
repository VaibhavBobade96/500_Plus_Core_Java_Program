//3.  Data hiding 

 class Bank{

  private double balance = 50000;

   void showBalance()
  {
    System.out.println("Show Balance :" +balance);
  }
}

public class DataHiddingDemo{

  public static void main(String[] args){

   Bank b = new Bank();
   b.showBalance();
 // System.out.println("print balance :" +b.balance);

  }

}
 
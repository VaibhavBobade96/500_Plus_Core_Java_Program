
interface calculator{

 void Add(int a, int b);
 void mult(int a, int b);

 }

 class MyCalculator implements calculator
 {
   public void Add(int a, int b)
   {
      int result = a + b;
     
      System.out.println("Addition of a and b :" +(result));
 
   }

   public void mult(int a , int b)
   {
     int result =  a * b;
     System.out.println(" Addition of a and b :" +(result));
   }

 }

 public class mainInterface3{
   
    public static void main(String[] args){

    MyCalculator m = new MyCalculator();
 
        m.Add(5,5);
        m.mult(5,5);

    }

}
    
 
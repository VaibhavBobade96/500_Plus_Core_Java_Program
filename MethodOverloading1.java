public class MethodOverloading1{
   

  void add(int a, int b)
  {
    System.out.println("Addition of a and b : "+(a+b));
  }

  void add(int a, double b)
  {
    System.out.println("Additin of a and b : " +(a+b));
  }

  public staticn void main(String[] args){

   MethodOverloading1 m = new MethodOverloading1();

   m.add(4, 6);
   m.add(7, 6.6);

 }

}
public class MethodOverloading2{
 
  void add(int a, int b, int c)
  {
    System.out.println("Addition of a b and c :"+(a+b+c));
  }

  void add(int a, int b, int c, int d)
  {
    System.out.println("Addition of a b and c :"+(a+b+c+d));
   }


public static void main(String[] args)
{ 
   MethodOverloading2 m = new MethodOverloading2();

   m.add(1,2,3);
   m.add(1,2,3,4);

}

}
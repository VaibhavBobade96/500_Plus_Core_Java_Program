public class Costructoer4{

  String name;
  int id;

  Costructoer4()
  {
    System.out.println("Default Constructor");
  }

  Costructoer4(int a)
  {
    id = a;
    System.out.println("Value of a :" +id);

  }

  Costructoer4(String b)
  {
    name = b;
    System.out.println("value vlue of b :"+name);

  }
 
public static void main(String[] args){
 
   Costructoer4 c1 = new Costructoer4();
   Costructoer4 c2 = new Costructoer4(4);
   Costructoer4 c3 = new Costructoer4("vaibhav");

 }

}


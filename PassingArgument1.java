//6.  Passing object to method 

class student 
{
  int id ;
  String name;
}

public class PassingArgument1{
   
   void display(student s)
    {
        System.out.println("Print id :" +s.id);
        System.out.println("Print name :"+s.name);
    }

public static void main(String[] args){

 student s1 = new student();
 
  s1.id = 101;
  s1.name = "Vaibhav";
 

 PassingArgument1 p = new PassingArgument1();
  p.display(s1);
  }

}


    
//5.  Multiple objects 

class student{

 int id;
 String name;

  void showDetails(int x, String y)
  {
     id = x; 
     name = y;
    System.out.println("id :"+id);
    System.out.println("name :"+name);
  }

}

public class classAndObjectProgramDemo2{

  public static void main(String[] args){

  student s = new student();
  s.showDetails(101, "Vaibhav");
  System.out.println();
  
  student s2 = new student();
  s2.showDetails(102, "Prashant");
    System.out.println();

 student s3 = new student();
  s3.showDetails(103, "Ram");
    System.out.println();

  student s4 = new student();
  s4.showDetails(104, "Rohan");
    System.out.println();

student s5 = new student();
  s5.showDetails(105, "Abhimanyue");
    System.out.println();



  }

}
 

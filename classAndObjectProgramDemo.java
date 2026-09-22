// Class and object 

class result{

 int id;
 String name;
 char ch;
 double salary;
 float balance;
 byte value;
 boolean num;
 short value2;
 long acountNo;
 
  void show()
  {
    System.out.println("int default value : "+id);
    System.out.println("String default value : "+name);
    System.out.println("Char default value : "+ch);
    System.out.println("double default value : "+salary);
    System.out.println("float default value : "+balance);
    System.out.println("byte default value : "+value);
    System.out.println("boolean default value : "+num);
    System.out.println("short default value : "+value2);
    System.out.println("long default value : "+acountNo);
    //System.out.println("static Number default value : "+number);


  }

}

public class classAndObjectProgramDemo
{
  public static void main(String[] args){
   
    result r = new result();
    r.show();
 }

}
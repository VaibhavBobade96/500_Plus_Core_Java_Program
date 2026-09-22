public class Constructor5{

 int id ;
 String name ;

   Constructor5(int id, String name)
   {
     this.id = id;
     this.name = name;

	 System.out.println("Id :"+id);
	 System.out.println("Name:"+name);
   }
 

 public static void main(String[] args){

  Constructor5 c = new Constructor5(101, "Vaibhav");

  }

 }
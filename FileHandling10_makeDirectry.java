import java.io.File;

public class FileHandling10_makeDirectry{

 public static void main(String[] args){

  
  File f = new File("My Folder");

  if(f.mkdir())
  {
    System.out.println("Directry Created Successfuylly..");

  }
  else{

     if(f.exists())
     {
       System.out.println("Directry is already Exist");
     }
     else{

       System.out.println("Directry is not Found");
      
      }

  }

   }

}
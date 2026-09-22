import java.util.*;

class PasswordException extends RuntimeException{

      PasswordException(String msg)
      {
         super(msg);
     }

}
public class throwprogram5{

   public static void main(String[] args){

     String password = "abc";

     if(password.length() < 8)
     {
       
        throw new PasswordException("The password must be be atleast 8 Charecter");
     }

     else{
      
         System.out.println(" Your password is valid ");
	
	}

    }
  
  }


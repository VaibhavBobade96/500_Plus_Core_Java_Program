import java.util.*;

public class throwExceptionProgram1 extends RuntimeException{

	public throwExceptionProgram1(String msg)
	{
		super(msg);
	}

   
}
public class throw1InException{

public static void main(String[] args){

     int age = 16;

     if(age >= 18)
     {
        System.out.println("you are eligible for voting");

     }

     else{

        throw new ArithmeticException("you are not eligible for voting");

	}

	System.out.println( "you can go for voting");
 
 }

}


 
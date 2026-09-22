

class CheckVowelsUsingMethod{

 public static void main(String[] args){

  
   check c1 = new check();

   c1.vowels();



 }

}

 class check
 {

   void vowels()
   {
     char letters[] = {'y', 'e', 'm', 'd', 'c'};

     for(int i = 0; i < letters.length; i++)
     {
       if(letters[i] == 'i' || letters[i] == 'e' || letters[i] == 'a' || letters[i] == 'o' || letters[i] == 'u')
        {
	      System.out.println("vowels : " +letters[i]);

	    }

	   else {

	      System.out.println("Consonants :" +letters[i]);

	    }
	 
     }

   }
 }

// 28 find shortest word

public class String28_FindTheshortestWord{

   public static void main(String[] args){

     String  name = "mye NAME is Vaibhav a";
     String word = "";
	 int count = 0;
	 int temp = 20;
     


     for(int i = 0; i < name.length(); i++)
     {
            if(name.charAt(i) != ' ')
             {
				 word = word + name.charAt(i);// a
				 count++;                     //3
		
		    }
          else{
				if(temp > count) //20 >  3 
				{
					temp = count; // TEMP = 3; 
				}
			     word = "";
			     count = 0;
	        }
	   
	 }


		 if(temp > count) // 2 > 
			 {
				  temp = count;
			 }

			 System.out.println(temp);  
 
   }

}


class student
{ 
	private int age;
	private String name;


   public void setAge(int age)
   {
	   this.age = age;
   }
   
   public int getAge()
	{
       return age;
	   System.out.println("Student age :" +age);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		System.out.println("Sudent Name :" +name);

        return name;
	} 
	 
}

 public class Encapsulation1
{
	public static void main(String[] args) 
	{
	   student s1 = new student();

	   s1.setAge(18);
	   s1.setName("Vaibhav");

	//  System.out.println("Student Age : " +s1.getAge());
	//  System.out.println("Student Name :" +s1.getName());

	  s1.getName();
	  s1.getAge();
	   
	   
	   
	}
}

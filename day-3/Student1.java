import java.util.*;
class Student
{
	private String name;
    	private int age;
	public void setName(String n) 
	{
        	name=n;
    	}
	public String getName()
 	{
        	return name;
    	}
	public void setAge(int a) 
	{
        	if(a>0) 
		{
            		age=a;
        	}
    	}
	public int getAge() 
	{
        	return age;
    	}
}
class EncapsulationExample 
{
	public static void main(String[] args) 
	{
        	Student s=new Student();
        	s.setName("Alice");
        	s.setAge(20);
		System.out.println("Name: " + s.getName());
        	System.out.println("Age: " + s.getAge());
    	}
}

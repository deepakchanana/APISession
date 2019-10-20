package pkg1;

//() indicate this is a method
// method name----deepak
// { }this indicate boundary
// syso is used for printing on the console
//anything inside double quotes will be printed on console

public class Class1 
{   
	int a=3444; 
	public void deepak()  
	{                                     
		System.out.println("Welcome to all of you");
	}  
	
	public static void main(String[] args) 
	{
	System.out.println("**********************************");
	 Class1 vinayk=new Class1(); 
	 vinayk.deepak(); // you have called the deepak method
	 
	 System.out.println(vinayk.a);
	 
	 
	 vinayk.a=34; // referencevariable.variable
	 System.out.println(vinayk.a);
	 vinayk.a=45;
	 System.out.println(vinayk.a);
	 System.out.println("************************************");
	}
	   
	  
	
}

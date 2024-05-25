/*
PROGRAM 2
Write a program to demonstrate static block take two static variables name and id and print them. 
*/  

class DemoStatic        //creating a class
{
    static String Name;           //initialize the variables name 
	static int id;                //initialize the variables id

	
	static             //creating a static block
	{ 
	    Name = "Akanksha" ;
		id = 1234;            
		   
	}
	public static void main(String args[])    //main method  
	{
		System.out.println("Name : "+Name);    //printing the static block
		System.out.println("Id : "+id); 
	}
}   


/*

OUTPUT
C:\anudip training\LAB4>javac DemoStatic.java

C:\anudip training\LAB4>java DemoStatic
Name : Akanksha
Id : 1234

*/   
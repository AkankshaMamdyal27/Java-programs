/*
PROGRAM 4
create a base class with constructor and inherit it in the derived class and call the base class constructor in derived class.
*/  

class Base
{

	Base()            	// Constructor of the base class
	{
		System.out.println("This is Base class constructor ");
		System.out.println();
	}
	public void getbase()
	{
		System.out.println("This is Base class method ");
		System.out.println();
		
	}
}



// Derived class inheriting from Base class
class Derived extends Base
{
	Derived()       // Constructor of the derived class
	{
		super();
		System.out.println("This is derived class of a constructor ");
		System.out.println();
	}
}


class DemoBase
{
	public static void main(String args[])
	{
		// Creating an instance of the derived class
		Derived d=new Derived();
		d.getbase();
	}
}

/*

OUTPUT

C:\anudip training\LAB4>javac DemoBase.java

C:\anudip training\LAB4>java DemoBase
This is Base class constructor

This is derived class of a constructor

This is Base class method

*/



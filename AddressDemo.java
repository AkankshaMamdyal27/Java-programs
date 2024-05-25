/*
PROGRAM 1
Define a class Address representing an address with attributes such as street, city, state,and zip code. Provide constructor to initialize
these attributes.
*/
//class name address and use no argument and parameterized constructor.


class Address
{
	String street;        // instance variables
	String city;
	String state; 
	String zipcode ;
	
	public Address(String street, String city, String state, String zipcode)      // declaring the parameterized construtor
	{
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
	}
	
	/*
	public Address()      // declaring the no argument construtor
		{
			this.street="";	
			this.city="";	
			this.state="";
			this.zipcode="";
		}
*/
		
	void printData()     // to print the data of the object
	{
		System.out.println("1. street:-" + this.street +  " 2. city:-" + this.city +   " 3. state:-" + this.state + " 4. zipcode:-" +this.zipcode);
	}
	
	
}
class AddressDemo
{
	public static void main(String args[])
	{
	    //with the parameterized constructor
		//Address add1= new Address();                  //creating the new object of the class 
		//add1.printData();                             //calling the print method
		
		Address add2 =new Address("34/2 rajiv nagar","solapur","maharastra","413005");        // create the new object with parameterized
		add2.printData();        //calling the print method
		
        Address add3=new Address("10/7 bhavani peth","pune","maharastra","413006");
		add3.printData();      //calling the print method
		
		Address add4 =new Address("37/9  navi peth","solapur","maharastra","413007");        // create the new object with parameterized
		add4.printData();        //calling the print method
		
        Address add5=new Address("10/7 Ravivar peth","mumbai","maharastra","413008");
		add5.printData();      //calling the print method
		
		
		
		/*
		//with the no argument constructor
		Address add4=new Address();
		System.out.println("Address : " +add4);
		*/
	}
}



	
	
	
	
	
	
	
	
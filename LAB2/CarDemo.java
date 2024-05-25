/*
PROGRAM 4
create a class named car with attributes make mode1, year and color.
include a method start() that points "Car Started" and a method stop() that prints "car stopped".
*/

class Car
{
	
	int year;
	String color;
	String model;//Attributes of car
	
	
	Car(String model, int year, String color)//Parameterized constructor
	{
        this.model = model;
        this.year = year;
        this.color = color;
	}
	void start()//start method of class car
	{
		this.model = model;
        this.year = year;
        this.color = color;
		System.out.println("Car started");//printing output
		System.out.println("Model :"+this.model+" Year :"+this.year+" Color :"+this.color);
		
	}	
	void stop()//stop method of class car
	{
		System.out.println("Car stopped");//printing output
	}
}
class CarDemo
{
	public static void main(String args[])
	{
		Car c1=new Car("Lamborghini",2025,"red");//printing values of start method
		c1.start();//calling start method
		c1.stop();//calling stop method
	}
}

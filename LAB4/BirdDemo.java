/*
PROGRAM 1
Define interface 'Flyable' and 'swimmable' with methods fly() and swin() respectively. 
Implement these interfaces in a class 'Bird' to demonstrate multiple interface implementation.
*/

interface Flyable         //Declare the flyable method
{
void fly();            
}

interface Swimmable       //Declare the swimmable method
{
void fly();
}
 
class Bird implements Flyable, Swimmable         //declaring the bird class that can be implementing both flyable and swimmable interfaces
{
	public void fly()
	{
		System.out.println("The bird is flying. ");
	}
	public void swim()
	{
		System.out.println("The bird is swimming. ");
	}
}

public class BirdDemo
{
	public static void main(String args[])    //main methode
	{
		Bird bird= new Bird();
		bird.fly();
		bird.swim();
	}
}

/*

OUTPUT
C:\anudip training\LAB4>java BirdDemo
The bird is flying.
The bird is swimming.

*/
	
 
        
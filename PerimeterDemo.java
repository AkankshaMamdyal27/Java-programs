/*
PROGRAM 3
Write a class with the name Perimeter using functions overload that computes the perimeter of a square, a rectangle and a circle.
Formula :
Perimeter of a square= 4 * s 
Perimeter of a rectangle = 2 * (1 + b)
Perimeter of a circle = 2 * (22/7) * r
*/

import java.util.Scanner;	 

class Perimeter	
{ 
    void perimeter(float side)	 //it is for the calculating square
	{ 
        double Calculation=4*side; // formula calculate perimeter 
        System.out.println("Perimeter of Square: "+Calculation);
    }
    void perimeter(float length,float breadth)	// to calculate perimeter of Rectangle
	{ 
        double Calculation=2*(length+breadth);// formula for calculate the rectangel
        System.out.println("Perimeter of Rectangle: "+Calculation);
    }
    void perimeter(float radius,String s)	 // to calculate perimeter of Circle
	{
        double Calculation=2*(22/7)*radius;// formula for calculating the circle
        System.out.println("Perimeter of Circle:"+Calculation);
    }
}
class PerimeterDemo	// main method
{
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in); // Scanner object creating to use
        Perimeter p1=new Perimeter();// object creation
        int choice;// choice for switch 
        System.out.println("1.Perimeter of Square");
		System.out.println("2.Perimeter of rectangle");
		System.out.println("3.Perimeter of Circle");
		System.out.println("Choose any one of them");
        choice=sc.nextInt();//input from user the choice
        switch(choice)
		{ 
            case 1:
					System.out.println("Enter the a Square Side: ");//taking the parameter from user
					float side=sc.nextFloat();//input
					p1.perimeter(side);//providing a method
            break;
            case 2:
					System.out.println("Enter the Length and breadth of a Rectangle: ");
					float length=sc.nextFloat();
					float breadth=sc.nextFloat();
					p1.perimeter(length,breadth);
            break;
            case 3:
					System.out.println("Enter the Radius of Circle: ");
					float radius=sc.nextFloat();
					p1.perimeter(radius,"circle");
            break;
            default:
					System.out.println("Please Enter a valid Choice");//wrong choice
            break;
        }
    }
}




























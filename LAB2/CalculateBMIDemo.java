/*
PROGRAM 3
A program that calulates Body Mass index(BML) based on user input of weight and height, 
and then catagorizes the BMI into underweight , normal, overweight, or obese categorized using if else statements.
*/
 
 
import java.util.Scanner;

class CalculateBMI
{
	float bmi,height,weight;//variable
	void getData()
	{
		//Taking values from user
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Height in m: "); //taking height as input from user
		height=sc.nextFloat();
		System.out.print("Enter Weight in Kg: "); //taking weight as input from user
		weight=sc.nextFloat();
	}
	void putData()//to display data
	{
		//displaying the values
        System.out.println("Height: "+height+" Weight: "+weight);
    }
	void bmiCalculate()
	{
		bmi=weight/(height*height); //formula for calculating BMI
		System.out.println("Body Mass Index= "+bmi);
		if(bmi<18.0)
		{
			System.out.println("Underweight");
		}
		if(bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("Normal");
		}
		else if(bmi>=25.0 && bmi<=29.9)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obese");
		}
	}	
}
class CalculateBMIDemo //main class
{
	public static void main(String args[]) //main method
	{
		CalculateBMI b=new CalculateBMI(); //creating object of class
		//calling methods
		b.getData();
		b.putData();
		b.bmiCalculate();	
	}
}

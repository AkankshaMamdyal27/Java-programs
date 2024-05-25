
 /*
PROGRAM1
Create two thread.one thread is finding the average of the first 10 numbers and another thread is printing the square of the number 
stored in array arr-(1,20,50,15,30) and make sure both threads can execute simultaneously.
*/


package com.packagethread;

class SquareNumber extends Thread
{
	public void run()
	{
		int arr[]={1,20,50,15,30};	// Creating and starting thread for calculating average
		for(int num : arr) 
	        {
	        	System.out.println("Square of " +num+ ": "+(num*num));
	        } 
	}
}
class AverageCalculator extends Thread
{	
	int arr[]={1,20,50,15,30};	// Creating and starting thread for calculating average
    public void run() // we are creating the run method
    {
        int sum=0;
        for(int i=1;i<=10;i++) 
        {
            sum +=i;
        }
        double average=sum/10;
        System.out.println("Average of first 10 numbers: " +average);
    }
}

public class ThreadSquare 
{
	public static void main(String[] args) // main thread is created
	{
		SquareNumber s1 = new SquareNumber(); // Creating and starting thread for printing squares of numbers in array
		AverageCalculator s2 = new AverageCalculator();
	    s1.start();
	    s2.start();
	}
}
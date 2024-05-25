/*
 PROGRAM 1
 Write a java program that calculates the sum of all even numbers present in an ArrayList of integers.
 Sample input
 2
 5
 8
 10
 15
 Expected Output: sum of even numbers is 20 
*/
 
package com.ExCollection;

import java.util.ArrayList;

public class EvenNumArray
{

	public static void main(String[] args)
	{
	ArrayList<Integer>a1=new ArrayList<Integer>();
	a1.add(2);
	a1.add(5);
	a1.add(8);
	a1.add(10);
	a1.add(15);
	
	int sum=0;
	for (int num: a1)
	{
		if(num%2==0)
		{
			sum+=num;
		}
	}
       System.out.println("Sum of even numbers is :" +sum); 
	}

}

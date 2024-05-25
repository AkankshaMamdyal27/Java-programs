/*
	PROGRAM 3
	Write a program using TreeSet insert integer values and print them.
*/

package com.LAB7;

import java.util.TreeSet;

public class TreeSetInteger
{

	public static void main(String[] args)
	{
		TreeSet<Integer>a=new TreeSet<>();
		
		
		a.add(12);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(30);
		
		System.out.println("Integer values in TreeSet : ");
		for(Integer value : a)
		{
			System.out.println(value);
		}
		
		
		
		

	}

}

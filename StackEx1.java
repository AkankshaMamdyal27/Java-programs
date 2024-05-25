/*
PROGRAM 2
Write a program to declare stack. Store 10 elements into it. Remove 4 elements from stack and display it
*/

package com.ExCollection;

import java.util.Stack;

public class StackEx1 
{

	public static void main(String[] args) 
	{
	
		Stack <Integer> s= new Stack<Integer>();
		s.add(10);
	    s.add(20);		 
		s.add(30);		 
		s.add(40);		 
		s.add(50);		 
		s.add(60);		 
		s.add(70);		 
		s.add(80);		 
		s.add(90);		 
		s.add(100);	
		
		System.out.println(s);
		int p=s.pop();
		System.out.println("Element are popped: "+p);
		
		int p1=s.pop();
		System.out.println("Element are popped: "+p1);
		
		int p2=s.pop();
		System.out.println("Element are popped: "+p2);
		
		int p3=s.pop();
		System.out.println("Element are popped: "+p3);	


		System.out.println("Elements are popped : "+s);
		
			
	}

}

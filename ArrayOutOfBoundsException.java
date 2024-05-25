/*
PROGRAM 2
Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.
// [Hint: Use array and loop and try to access the element beyond the last index]
*/

package com.packagethread;

public class ArrayOutOfBoundsException 
{
	public static void main(String[] args) 
	{
		int arr[]={1, 2, 3, 4, 5}; // Array with 5 elements
	    for (int i=0;i<=9;i++) // Loop through the array and try to access the element beyond the last index
	    {
	    	try 
	        {
	    		System.out.println("Element at index " +i+ ": " +arr[i]);
	        } 
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	        	System.out.println("Exception caught: "+e);
	        }  
	    }
	}
}
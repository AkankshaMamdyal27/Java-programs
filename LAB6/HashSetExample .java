/*Program 3
Write a java program to append the specified element to the end of a hash set.
*/

package com.ExCollection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample 
{

	public static void main(String[] args)
	{
		HashSet<String> h1=new HashSet<String>();
		
		h1.add("Nani");
		h1.add("Akanksha");
		h1.add("Nandini");
		h1.add("Vinay");
		h1.add("Shriram");
		h1.add("kanchan");
		h1.add("Akshaya");
		
		
		
		System.out.println("Hash Set Elements are : "+h1);
		System.out.println();
		
		h1.add("Pranali");
		h1.add("Megha");
		h1.add("Niraja");
		
		System.out.println("Updated hast set elements are :"+h1);
		
		}

}



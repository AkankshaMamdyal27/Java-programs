/*
 Program 4 
 Write a java program to convert a hashset class element into treeset elements
 */

package com.ExCollection;
 
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample2 
{

	public static void main(String[] args) 
	{
		HashSet <String>h1=new HashSet <String>();
		
		h1.add("Nani");
		h1.add("Akki");
		h1.add("Nandu");
		h1.add("akshu");
		
		
		System.out.println("Hash Set Elements are : " +h1);
		System.out.println();
		
		
		TreeSet<String>t1=new TreeSet<String>(h1);
		t1.add("kanchan");
		System.out.println("Converted hash set elements into the Tree Set Elements are : "+t1);
		
		
	}

}

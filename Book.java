/*
Create a class named book with attributes title, author, ISBN, and price. Include methods to get and set the attributes (25 marks)
*/

import java.util.Scanner;

class BookDemo
{
	String Title;                                        //instance variable
	String Author;
	int ISBN;
	int price;
	
	void get()                                           //Create a get method
	{
		System.out.println("Enter the Details of Book");
		
		Scanner sc=new Scanner(System.in);                               //taking user input
		
		System.out.println("Enter Title of book :");                     //print stmt
		this.Title=sc.next();
		
		System.out.println("Enter the Author name :");
		this.Author=sc.next();
		
		System.out.println("Enter the ISBN number of Book :");
		this.ISBN=sc.nextInt();
		
		System.out.println("Enter the price of the book :");
		this.price=sc.nextInt();
	}
	void setData()                                                         //Creating setData method
	{
		System.out.println("Title :"+this.Title+"\nAuthor name :"+this.Author+"\nISBN :"+this.ISBN+"\nPrice :"+this.price);
	}
}
class Book
{
	public static void main(String args[])                  //main method of class
	{
		BookDemo b1=new BookDemo();                         //creating the object of book class
		b1.get();                                           //call get method
		b1.setData();                                           //calling method 
	}
}
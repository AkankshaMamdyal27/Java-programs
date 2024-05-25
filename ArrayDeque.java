/*
PROGRAM 2
Write a program using ArrayDeque to add book names and add, delete the values from both ends of queue.
*/

public class ArrayDeque
{
	public class void main(String args[])
	{
		ArrayDeque<String>a=new ArrayDeque<>();
		
		
		a.addLast("Book 1");
		a.addLast("Book 2");
		a.addLast("Book 3");
		
		
		
		System.out.println("Books in the Queue");
		System.out.println(a);
		
		a.addFirst("Book 0");
		
		System.out.println("/nBooks after adding at the front : ");
		System.out.println(a);
		
		String removeBook=a.removeFirst();
		
		System.out.println("/nRemoved book from the front : "+removeBook);
		System.out.println("Books after removing from the front : ");
		system.out.println(a);
		
		
		removeBook=a.removeLast();
		
		System.out.println("/nRemoved book from the end : "+removeBook);
		System.out.println("Books after removing from the end : ");
		system.out.println(a);
		
	}
}
		
		
		
		
	    
/*
PROGRAM 3
create a class student and implement array and display details of student.
*/   

import java.util.ArrayList;


class Student    
{
	String sname;
	int sid;
	String sdept;
	Student(String name,int id,String dept)      //assign the values
	{
		this.sid=id;
		this.sname=name;
		this.sdept=dept;
	}
	public String getName()       //printing the values using the variable name
	{
		return sname;
	}
	public int getId()           //printing the values 
	{
		return sid;
	}
	public String getDept()           //printing the values
	{
		return sdept;
	}
	
	
}

class StudentArrayList
{
	public static void main(String args[])     //main method
	{
		
		
		
		ArrayList<Student>students=new ArrayList<>();       //creating an array list to storing the sudent details
		
		
		//adding students details of each student
		
		students.add(new Student("Akanksha",1234,"IT"));
		students.add(new Student("Akshaya",1235,"CSE"));
		students.add(new Student("Amruta",1236,"EC"));
		students.add(new Student("Aaradhya",1237,"E&TC"));
		
		
		//Display details of each student
		System.out.println("The student Details are given below ");
		for(Student student : students)
		{
			System.out.println("Name : "+student.getName());
			System.out.println("ID   : "+student.getId());
			System.out.println("DEPT : "+student.getDept());
		
		
			System.out.println();
		
		}
	}
		
		
}

/*

OUTPUT

C:\anudip training\LAB4>javac StudentArrayList.java

C:\anudip training\LAB4>java StudentArrayList
The student Details are given below
Name : Akanksha
ID   : 1234
DEPT : IT

Name : Akshaya
ID   : 1235
DEPT : CSE

Name : Amruta
ID   : 1236
DEPT : EC

Name : Aaradhya
ID   : 1237
DEPT : E&TC

*/     
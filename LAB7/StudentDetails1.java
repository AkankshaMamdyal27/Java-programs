/*
PROGRAM 1
Write a program using Vector to store the list of students details and print the details.
*/


import java.util.Vector;

class Student 
{
    String StudName;
    int StudId;
    String department;

    public Student(String StudName, int StudId, String department) 
	{
        this.StudName = StudName;
        this.StudId = StudId;
        this.department = department;
    }

    public String getStudName() 
	{
        return StudName;
    }

    public int getStudId()
	{
        return StudId;
    }

    public String getDepartment() 
	{
        return department;
    }

    @Override
    public String toString() 
	
	{
        return "Name: " + StudName + ", Age: " + StudId + ", Department: " + department;
    }
}

public class StudentDetails1
 {
    public static void main(String[] args)
	{
        Vector<Student> students = new Vector<>();

        // Adding students to the vector
		
        students.add(new Student("Akanksha", 20, "Computer Science"));
        students.add(new Student("Nandini", 21, "Electrical Engineering"));
        students.add(new Student("kanchan", 19, "Mathematics"));

        // Printing student details
		
        System.out.println("Student Details are :");
        for (Student student : students) 
		{
            System.out.println(student);
        }
    }
}



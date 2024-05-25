/*
Create a class named Employess with attributes name, employeeID, designation, and salary.
include a method calculateBonus() that returns 5% of the salary as bonus. (50 marks)
*/

import java.util.Scanner;

class EmployeeDemo
{
	String name;
    int emp_id;                                          //instance variable
    String designation;
    double salary;
	
	void getData()
	{
		System.out.println("**Enter Details of Employee**");
		Scanner sc=new Scanner(System.in);                                 // take input from user
		
		System.out.println("Enter the Employee name :");
		this.name=sc.next();
		
		System.out.println("Enter the Employee id :");
		this.emp_id=sc.nextInt();
		
		System.out.println("Enter the Employee designation :");
		this.designation=sc.next();
		
		System.out.println("Enter the Employee Salary :");
		this.salary=sc.nextInt();
	}
	void setData()//Creating setData method
	{
		System.out.println("**The Employee Details are :**");
		System.out.println("Employee Name :"+this.name+"\nEmployee ID :"+this.emp_id+"\nDesignation :"+this.designation+"\nSalary :"+this.salary);
	}
	void calculateBonus()                                                      //creating a method
	{
		double bonus = 0.05 * salary;                                          // 5% of the salary
        System.out.println("Bonus: " + bonus);
	}
}
class Employee
{
	public static void main(String args[])
	{
		EmployeeDemo e1=new EmployeeDemo();                                    //creating the object of Employee
		e1.getData();
		e1.setData();
		e1.calculateBonus();                                                   //calling method		
	}
}
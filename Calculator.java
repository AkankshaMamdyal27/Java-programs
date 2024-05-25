/*
Write a Program to create a simple calculator program that takes user input for two numbers
and an operator(+,-,*,/) and performs the coresponding arithemetic operation using conditional statements.(25 marks)
*/

import java.util.Scanner;
class Calculator 
{
    public static void main(String args[])                                 // main function
	
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int Num1 = sc.nextInt();                                           // Stores numbers

		
        System.out.println("Enter the second number: ");
        int Num2 = sc.nextInt();                                           // Stores numbers

		
        System.out.println("Enter the type of operation you want to perform (+, -, *, /): ");
        String op = sc.next();
		
        int result = performOp(Num1, Num2, op);
        System.out.println("Your answer is: " + result);
    }
    public static int performOp(int Num1, int Num2, String op)
    {
        int result = 0;
        if (op.equals("+"))                                              // case to add two numbers
		{
            result = Num1 + Num2;
        }
        else if (op.equals("-"))                                         // case to subtract two numbers
		{
            result = Num1 - Num2;
        }
        else if (op.equals("*"))                                         // case to multiply two numbers
		{ 
            result = Num1 * Num2; 
        }
        else if (op.equals("/"))                                          // case to divide two numbers
		{
            result = Num1 / Num2;
        }
        else 
		{
            System.out.println("You enter wrong input");
        }
        return result;
    }
}

/*
PROGRAM 1
WAP for creating the mini calculator,you have to perform an operation on the basis of user choise until the user press yes to continue
(add, mul, sub, div)
*/

import java.util.Scanner;

class  CalculatorEx
{
	public static void main(String[] args) 
{
    char operator;//
    Double n1, n2, result;

    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);
	char choice;
	do{
    // ask users to enter operator
    System.out.println("Choose a operator: +, -, *, or /");
    operator = sc.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    n1 = sc.nextDouble();

    System.out.println("Enter second number");
    n2 = sc.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
    }
		System.out.print("Do you want to Continue? (yes/no): ");
        choice = sc.next().charAt(0);
        } while (choice == 'yes' || choice == 'Yes');

        System.out.println("Bye bye");
        sc.close();
  }
}

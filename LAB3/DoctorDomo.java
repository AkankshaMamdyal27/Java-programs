/*
PROGRAM 2
Create a program in java to implement multilevel inheritance and hierachical inheritance.
Take classes like: Doctor, Surgeon and Nurse
Create methods and show method overriding.
*/


class Doctor 	// Parent class
{
    void diagnose() 
	{
		System.out.println("The doctor is diagonosing the patient" );
    }

}
class Surgeon extends Doctor 	// Child class extending Doctor
{
	void treat() 
	{
        System.out.println("The Doctor is treating the patient" );
    }

    void performSurgery() 
	{
        System.out.println("The Doctor is performing surgery.");
    }
}

class Nurse extends Doctor 	// Another child class extending Doctor
{
    void treat()
	{
        System.out.println("Nurse is providing care and assistance to the patient.");
    }

    void assistDoctor()
	{
        System.out.println("The Nurse is assisting the doctor during procedures.");
    }
}

class DoctorDemo 
{
    public static void main(String args[]) 
	{
        Surgeon s1 = new Surgeon();	 // Multilevel inheritance example
        s1.diagnose();		 // Override method is called
        s1.performSurgery(); 	// Method from Surgeon class

        Nurse n1 = new Nurse();	// Hierarchical inheritance example
        n1.diagnose(); // Override method is called
        n1.assistDoctor(); // Method from Nurse class
    }
}

	
	
	
	
	
	

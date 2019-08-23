package CSC205;

import java.util.Scanner;

/**
 * 
 *Program ID:  PersonTester.java
 *Date : 
 *Brief Description:
         Tester program for creating Person objects
         Person class definition can be found in Person.java
 *
 */

/**
 * <p>
 * OUTPUT:
 *Person #1
Enter a name please: Minnie Mouse
Enter a birth year:  1928

The Person data is:
        Name: Minnie Mouse
  Birth Year: 1928
         Age: 86

Person #2
Enter a name please: Mickey Mouse
Enter a birth year:  1928

The Person data is:
        Name: Mickey Mouse
  Birth Year: 1928
         Age: 86

 * 
 *
 */
public class PersonTester {

	public static void main(String[] args) {
		
		String pName;
		int pBirthYear;
		int currentYear;
        int count = 1;
        
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println( "Creating Person objects");
		System.out.println( "-----------------------" );
		
		
		System.out.println( "Enter the current year: ");
		currentYear = scan.nextInt();
		scan.nextLine(); //reads the dangling newline 
		
		    //First Person Object
			System.out.println( "\nPerson #" + count++);
			System.out.println( "Enter a name please: ");
			pName = scan.nextLine(); //allows you to enter multiple words 
			System.out.println( "Enter a birth year : ");
			pBirthYear = scan.nextInt();
			scan.nextLine(); //reads the dangling newline 
			Person teacher = new Person(pName, pBirthYear); //create a Person object
			System.out.println( "\nThe Person data is:" );
			System.out.println(teacher);
			System.out.println("\tAge: " + teacher.calculateAge(currentYear));
			
           //Second Person Object
			System.out.println( "\nPerson #" + count++);
			System.out.println( "Enter a name please: ");
			pName = scan.nextLine(); //allows you to enter multiple words 
			System.out.println( "Enter a birth year : ");
			pBirthYear = scan.nextInt();
            
			Person student = new Person(pName, pBirthYear); //create a Person object
			System.out.println( "\nThe Person data is:" );
			System.out.println(student);
			System.out.println("\t age: " + student.calculateAge(currentYear));
		
			//Below call the equals method to see if both persons are the same age or no
			//display appropriate message in both cases. 
			if(teacher.equals(student))
			   {
				System.out.println("Teacher " + teacher.getName() + " is almost the same age as " +
			                       "Student " + student.getName());
			   }
			else
			  {
				System.out.println("Teacher " + teacher.getName() + " is NOT the same age as " +
			                       "Student " + student.getName());
			   }

	}

}

/*
Test 1:
Creating Person objects
-----------------------
Enter the current year: 
2019

Person #1
Enter a name please: 
Abraham Lincoln
Enter a birth year : 
1809

The Person data is:
	Name: Abraham Lincoln
Birth Year: 1809
	Age: 210

Person #2
Enter a name please: 
Dillan Poorman
Enter a birth year : 
1994

The Person data is:
	Name: Dillan Poorman
Birth Year: 1994
	 age: 25
Teacher Abraham Lincoln is NOT the same age as Student Dillan Poorman

Test 2:

Creating Person objects
-----------------------
Enter the current year: 
2019

Person #1
Enter a name please: 
Dillan
Enter a birth year : 
1994

The Person data is:
	Name: Dillan
Birth Year: 1994
	Age: 25

Person #2
Enter a name please: 
Joe
Enter a birth year : 
1994

The Person data is:
	Name: Joe
Birth Year: 1994
	 age: 25
Teacher Dillan is almost the same age as Student Joe

*/
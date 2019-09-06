
package CSC205;

import java.util.Calendar;


public class Person {
	
	private String name;
	private int birthYear;
	
	//default constructor initialize instance variable
	public Person() {
		name = "unknown";
		birthYear = 0;
		
	}
	
	//overloaded constructors initialized with instances variables
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	//gets name
	public String getName() {
		return name;
	}
	
	//gets birth year
	public int getBirthYear() {
		return birthYear;
	}
	
	//sets name
	public void setName(String name) {
		this.name = name;
		
	}
	
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int calculateAge(int currentYr) {
		int age = 0;
		
		if(birthYear == 0) {
			
			age = 0;
			
		} else {
			
		age = currentYr - birthYear;
		
		}
		
		return age;
		
	}
	
	public boolean equals(Person p) {
		
		if (this.birthYear == p.birthYear) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		
		return ("\tName: " + this.name + "\nBirth Year: " + this.birthYear);
	}
	
}

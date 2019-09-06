package CSC205;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = new Person[3];
		
		people[0] = new Person("James Gosling", 1955);
		people[1] = new Person("Dennis Ritchie", 1941);
		people[2] = new Person();
		
		for(Person people1 : people) {
		System.out.println("The age of " + people1.getName() + " is " + people1.calculateAge(2019));
		}
		
		System.out.println("\n");
		
		for(Person people1 : people) {
			System.out.println(people1.toString() + "\n");
		}
		
		

	}

}

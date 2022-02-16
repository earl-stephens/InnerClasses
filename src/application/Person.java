package application;

public class Person {
	private String name;
	public Person (String name) {
		this.name = name;
	}
	
	/* Non static inner classes are associated with objects,
	 * and can access instance variables
	 */
	
	public class Printer {
		public void print() {
			System.out.println(name);
		}
	}
	
	//Use non static inner classes for things like implementing
	//interfaces such as Runnable
	
	public void display() {
		Printer printer = new Printer();
		printer.print();
	}
}

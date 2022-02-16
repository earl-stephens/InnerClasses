package application;

public class App {

	public static void main(String[] args) {
		Person person = new Person("Sigmund");
		person.display();
		
		/* The syntax for instantiating an inner non static
		 * class object is different.  Can't do Person.Printer.  
		 * Printer has to be associated with objects.  In this case
		 * need a Person object
		 */
		Person.Printer printers = person.new Printer();
	}

}

package com.pl.robert;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class Main {
	
	private static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) throws MyException {
		
		PropertyConfigurator.configure("Log4J.properties");

		Person person1 = new Person("Jan", "Kowalski");

		person1.addBook("Matematyka 2", 2010);
		try
		{
			person1.addBook("Matematyka", 1500);
		}
		catch(MyException e)
		{
			logger.error(e.getMessage());
		}
		person1.addBook("Java", 2005);
		person1.addBook("C++", 1999);
		person1.addBook("PHP",2004);
		person1.removeBook("PHP");
		person1.editBook("C++", 2007);
		
		

		System.out.println("************************");
		person1.showPerson();
		person1.showBook();
		
		System.out.println("*************************");
		person1.searchBook("Matematyka 2");

		System.out.println("*************************");

		Person person2 = new Person("Jan", "Nowak");

		person2.addBook("Java zaawansowana", 1995);
		person2.removeAllBooks(); 
		person2.addBook("Java postawy", 1993);

		person2.showPerson();
		person2.showBook();

	}
}
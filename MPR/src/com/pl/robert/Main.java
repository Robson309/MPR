package com.pl.robert;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) throws YearException {

		PropertyConfigurator.configure("Log4J.properties");

		Person ja = new Person("Jan", "Kowalski");

		ja.addBook("Cration games", 2007);
		try
		{
			ja.addBook("Cration games 2", 1888);
		}
		catch(YearException e)
		{
			logger.error(e.getMessage());
		}
		ja.addBook("Java", 2009);
		ja.addBook("Pascal", 1999);
		ja.addBook("C#",2000);
		ja.editBook("C#", 2010);
		ja.removeBook("Pascal");

		ja.showPerson();
		System.out.println("***********************************");
		ja.showBook();
		System.out.println("Search");
		ja.searchBook("Cration games");

		System.out.println("***********************************");

		Person lol = new Person("Jan", "Nowak");

		lol.addBook("CCS", 2006);
		lol.removeAllBooks();
		lol.addBook("HTML5", 2011);

		lol.showPerson();
		System.out.println("***********************************");
		lol.showBook();

	}
}
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pl.robert.*;


public class test {	
	@Test
	public void testName() {
		Person person = new Person("Jan", "Niezbedny");
		assertTrue(person.getName().equals("Jan"));
	}
	
	@Test
	public void testSurname() {
		Person person = new Person("Jan", "Niezbedny");
		assertTrue(person.getSurname().equals("Niezbedny"));
	}

	@Test
	public void testAddBook() throws YearException {
		Person person = new Person("Jan", "Niezbedny");
		Book b = new Book("C++", "Grebosz", 1998);
		person.addBook(b);
		assertTrue(person.getBookList().size() == 1);
	}

	@Test
	public void testGetName() {
		Person person = new Person("Jan", "Niezbedny");
		assertTrue(person.getName() == "Jan");
	}

	@Test
	public void testSetName() {
		Person person = new Person("Jan", "Niezbedny");
		person.setName("Wojtek");
		assertTrue(person.getName() == "Wojtek");
	}
	
	@Test
	public void testSetSurname() {
		Person person = new Person("Jan", "Niezbedny");
		person.setSurname("Zbedny");
		assertTrue(person.getSurname() == "Zbedny");
	}
	
	@Test
	public void testGetTitle() throws YearException {
		Person testowy = new Person("Jan", "Niezbedny");
		Book b = new Book("C++", "Grebosz", 1998);
		testowy.addBook(b);
		assertTrue(testowy.getBookList().get(0).getTitle().equals("C++"));
	}

	@Test
	public void testSetTitle() {
		Person testowy = new Person("Jan", "Niezbedny");
		Book b = new Book("Computer", "Vadu Ratu", 1998);
		String newtitle= "Fast computer";
		testowy.addBook(b);
		testowy.getBookList().get(0).setTitle(newtitle);
		assertTrue(testowy.getBookList().get(0).getTitle().equals(newtitle));
	}

	@Test
	public void testGetYearPublication() throws YearException {
		Person testowy = new Person("Jan", "Niezbedny");
		int year = 1998;
		Book b = new Book("Kot w butach", "Unknow", year);
		testowy.addBook(b);
		assertTrue(testowy.getBookList().get(0).getDatePublication() == year);
	}

	@Test
	public void testSetYearPublication() throws YearException {
		Person testowy = new Person("Jan", "Niezbedny");
		Book b = new Book("Java zaawansowana", "Horstan", 1998);
		int newyear = 2007;
		testowy.addBook(b);
		testowy.getBookList().get(0).setDatePublication(newyear);
		assertTrue(testowy.getBookList().get(0).getDatePublication() == newyear);
	}
}

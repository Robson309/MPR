package com.pl.robert;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Person {

	String name;
	String surname;
	List<Book> listBooks = new ArrayList<Book>();
	
	private static Logger logger = Logger.getLogger(Person.class);

	public Person(String name, String surname) {

		this.name = name;
		this.surname = surname;
		this.listBooks = new ArrayList<Book>();
	}

	public void showPerson() {
		System.out.println("Name: " + name + "Surname: " + surname);
	}

	public void showBook() {
		for (Book b : listBooks) {
			b.showBook();
		}

	}

	public void addBook(String name, int datepublication) throws MyException {
		if (datepublication>1990)
		listBooks.add(new Book(name, datepublication));
		if (datepublication<=1990) throw new MyException("Publication date cant be erlier then 1990");
		logger.info("Add new book " + name + " date of publication " + datepublication);
	}

	public void removeBook(String name) {
		int position = 0;
		for (Book book : listBooks) {
			if (book.getName().equals(name)) {
				listBooks.remove(position);
				break;
			}
			position++;
		}
	logger.info("Remove book " + name);
	}

	public void removeAllBooks() {
		listBooks.clear();
	}

	public void editBook(String name, int newDatePublication) {
		int position = 0;
		for (Book book : listBooks) {
			if (book.getName().equals(name)) {
				listBooks.set(position, new Book(name, newDatePublication));
				break;
			}
			position++;
		}
	}

	public void searchBook(String nazwa) {
		int position = 0;
		for (Book book : listBooks) {
			if (book.getName().equals(nazwa)) {
				System.out.println("Search book " + book.getName()
						+ " is on possition " + position);
			}
			position++;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Book> getListBooks() {
		return listBooks;
	}

	public void setListBooks(List<Book> listBooks) {
		this.listBooks = listBooks;
	}

}

package com.pl.robert;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Person {

	String name;
	String surname;
	List<Book> listBook = new ArrayList<Book>();
	
	private static Logger logger = Logger.getLogger(Person.class);

	public Person(String name, String surname) {

		this.name = name;
		this.surname = surname;
		this.listBook = new ArrayList<Book>();
	}

	public void showPerson() {
		System.out.println("Name: " + name + " surname: " + surname);
	}

	public void showBook() {
		for (Book b : listBook) {
			b.showBook();
		}

	}

	public void addBook(String title, int yearpublication) throws MyException {
		listBook.add(new Book(title, yearpublication));
		if (yearpublication<=1990)
			throw new MyException("Date of publication have to be after 1990");
		logger.info("Add new book " + title + " year of publication " + yearpublication);
	}

	public void removeBook(String title) {
		int position = 0;
		for (Book book : listBook) {
			if (book.getTitle().equals(title)) {
				listBook.remove(position);
				break;
			}
			position++;
		}
	logger.info("Remove book " + title);
	}

	public void removeAllBooks() {
		listBook.clear();
	}

	public void editBook(String title, int newTitle) {
		int position = 0;
		for (Book book : listBook) {
			if (book.getTitle().equals(title)) {
				listBook.set(position, new Book(title, newTitle));
				break;
			}
			position++;
		}
	}

	public void searchBook(String title) {
		int position = 0;
		for (Book book : listBook) {
			if (book.getTitle().equals(title)) {
				System.out.println("Search book " + book.getTitle()
						+ " is on position " + position);
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

	public List<Book> getListBook() {
		return listBook;
	}

	public void setListBook(List<Book> listBook) {
		this.listBook = listBook;
	}

}

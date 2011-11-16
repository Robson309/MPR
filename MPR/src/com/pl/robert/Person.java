package com.pl.robert;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

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
		System.out.println("Name: " + name + "\tSurname: " + surname);
	}

	public void showBook() {
		for (Book g : listBook) {
			g.showBook();
		}

	}

	public void addBook(String title, int datepublication) throws MyException {
		if (datepublication > 0) {
			listBook.add(new Book(title, datepublication));
			logger.info("Add book" + title + " date of publication " + datepublication);
		}
		if (datepublication <= 0)
			throw new MyException("Date of publication can not be after 0");
	}

	public void removeBook(String title) {
		listBook.remove(search(title));
		logger.info("Remove book " + title);
	}

	public void removeAllBooks() {
		listBook.clear();
		logger.info("Remove all books");
	}

	public void editBook(String title, int newDatePublication) throws MyException {
		if (newDatePublication > 1900) {
			listBook.set(listBook.indexOf(search(title)), new Book(title,
					newDatePublication));
			logger.info("Edit book " + title + " date publication change "
					+ search(title).getDatePublication() + " to " + newDatePublication);
		}
		if (newDatePublication <= 1900)
			throw new MyException("Edit date publication can't be after 1990");
	}

	public void searchBook(String title) {
		System.out.println("Search book " + search(title).getTitle()
				+ " is on position "
				+ listBook.indexOf(search(title)));

	}

	public Book search(String title) {
		for (Book book : listBook) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return search(title);
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
		return listBook;
	}

	public void setListBook(List<Book> listBooks) {
		this.listBook = listBooks;
	}

}

package com.pl.robert;

import java.util.ArrayList;
import java.util.List;

public class Person {
	public String name;
	public String surname;
		
	public List<Book> bookList = new ArrayList<Book>();
	 
	public Person(String name, String surname)
	{
		this.name = name;
		this.surname = surname;
	}
	
	public Person(String name, String surname, List<Book> bookList)
	{
		this.name = name;
		this.surname = surname;
		this.bookList = bookList;
	}
	
	public void showBooks()
	{
		for(Book b : this.bookList)
		{
			b.showBooks();
		}
	}

	public void showPerson() {
		System.out.println(name + " " + surname);
	}

	public void printBook() {
		for (Book b : bookList) {
			b.showBooks();
		}
	}

	public void addBook(Book b) {
		
		bookList.add(b);
	}

	public void removeBook(Book book) {		
		bookList.remove(book);
		}
		

	public void clearBookList() {
		bookList.clear();
	}


	public Book searchBookTitle(String title) {
		
		for (Book book : bookList) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}
	
	public Book findBookAuthor(String author) {
		
		for (Book book : bookList) {
			if (book.getAuthor().equals(author)) {
				return book;
			}
		}
		return null;
	}
	
	public List<Book> findAll(String title) {
		List<Book> resultsList= new ArrayList<Book>();
		for (Book book : bookList) {
			if (book.getTitle().equals(title)) {
				resultsList.add(book);
			}
		}
		return resultsList;
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

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
}

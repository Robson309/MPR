package com.pl.robert;
public class Book {

	String title;
	Integer datepublication;

	public Book(String title, Integer datepublication) {
		this.title = title;
		this.datepublication = datepublication;
	}

	public void showBook() {
		System.out.println("Title: " + this.title + "\tDate of publication: " + this.datepublication);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getDatePublication() {
		return datepublication;
	}

	public void setDatePublication(Integer datepublication) {
		this.datepublication = datepublication;
	}
}
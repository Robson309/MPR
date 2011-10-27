package com.pl.robert;
public class Book {

	String title;
	Integer yearpublication;

	public Book(String title, Integer yearpublication) {
		this.title = title;
		this.yearpublication = yearpublication;
	}

	public void showBook() {
		System.out.println("Title: " + this.title + " year of publication: " + this.yearpublication);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYearpublication() {
		return yearpublication;
	}

	public void setYearpublication(Integer yearpublication) {
		this.yearpublication = yearpublication;
	}
}
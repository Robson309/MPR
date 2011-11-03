package com.pl.robert;
public class Book {

	String name;
	Integer datepublication;

	public Book(String name, Integer datepublication) {
		this.name = name;
		this.datepublication = datepublication;
	}

	public void showBook() {
		System.out.println("Name: " + this.name + "datepublication: " + this.datepublication);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDatePublication() {
		return datepublication;
	}

	public void setCena(Integer datepublication) {
		this.datepublication = datepublication;
	}
}
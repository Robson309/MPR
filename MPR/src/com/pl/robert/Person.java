package com.pl.robert;

//import java.util.ArrayList;
import java.util.List;

public class Person {
	public String name;
	public String surname;
	
	public List<Ksiazka> listaKsiazek;
	
	public Person(String name, String surname, List<Ksiazka> ksiazki)
	{
		this.listaKsiazek=ksiazki;
		this.name=name;
		this.surname=surname;
	}
	
	public void printPerson()
	{
		System.out.println("Imie "+ this.name + " Nazwisko " + this.surname);
	}
	
	public void printKsiazki()
	{
		for(Ksiazka c : listaKsiazek)
			c.printKsiazka();
	}
}

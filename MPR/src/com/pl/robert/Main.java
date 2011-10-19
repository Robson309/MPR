package com.pl.robert;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Ksiazka> listaKsiazek= new ArrayList<Ksiazka>();
		listaKsiazek.add(new Ksiazka("Java", "Gary Horstman"));
		listaKsiazek.add(new Ksiazka("Krzyzacy", "Sienkiewicz"));
		
		Person p = new Person ("Jan", "Kowalski", listaKsiazek);
		p.printPerson();
		p.printKsiazki();
	}

}

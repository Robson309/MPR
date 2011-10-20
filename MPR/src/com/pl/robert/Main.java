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
		listaKsiazek.add(new Ksiazka("Pan Tadeusz", "Mickiewicz"));
		
		Person p = new Person ("Jan", "Kowalski", listaKsiazek);
		p.printPerson();
		p.printKsiazki();
		
		p.removeKsiazka("Krzyzacy");
		p.renameTytul("Java", "Java podstawy");
		p.renameAutor("Java podstawy", "Hostan i Cornel");
		
		System.out.println("**********");
		p.printPerson();
		p.printKsiazki();
		System.out.println("**********");
		
		p.searchKsiazka("Pan Tadeusz");
	}

}

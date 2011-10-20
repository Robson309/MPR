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
	public void removeKsiazka(String tytul)
	{
		int pozycja=0;
		for (Ksiazka k: listaKsiazek)
		{
			if (k.getTytul().equals(tytul))
			{
				listaKsiazek.remove(pozycja);break;
			}
			pozycja++;
		}
	}
	public void renameTytul(String tytul, String nowytytul)
	{
		int pozycja=0;
		for (Ksiazka k: listaKsiazek)
		{
			if (k.getTytul().equals(tytul))
			{
				String autor = k.getAutor();
				listaKsiazek.set(pozycja, new Ksiazka(nowytytul, autor));
			}
			pozycja++;
		}
	}
	public void renameAutor(String tytul, String newautor)
	{
		int pozycja=0;
		for (Ksiazka k: listaKsiazek)
		{
			if (k.getTytul().equals(tytul))
			{
				listaKsiazek.set(pozycja, new Ksiazka(tytul, newautor));
			}
			pozycja++;
		}
	}
	public void searchKsiazka(String tytul)
	{
		int pozycja=0;
		for (Ksiazka k: listaKsiazek)
		{
			if (k.getTytul().equals(tytul))
			{
				//pozycja+1 bo numerowanie od zera 
				System.out.println("Książka " + tytul 
						+ " jest na pozycji " +(pozycja+1));
			}
			pozycja++;
		}
	}
}

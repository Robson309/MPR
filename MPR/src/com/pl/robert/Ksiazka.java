package com.pl.robert;

public class Ksiazka implements Ibook {
	public String tytul;
	public String autor;
	
	public Ksiazka(String tytul, String autor)
	{
		this.autor=autor;
		this.tytul=tytul;
	}
	public void printKsiazka() {
		System.out.println("tytul: " + tytul + "autor" + autor);
	}
}

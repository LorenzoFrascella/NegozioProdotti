package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Negozio {
	//ATTRIBUTI
	private ArrayList <Prodotto> prodotti;
	
	//COSTRUTTORE
	public Negozio(ArrayList <Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	
	//GET E SET
	public ArrayList <Prodotto> getProdotti(){
		return prodotti;
	}
	
	//METODI
	public void aggiungi() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserire il nome del prodotto da aggiungere: ");
		String nome = scanner.nextLine(); //legge stringa per nome
		
		System.out.print("Inserire la categoria del prodotto da aggiungere: ");
		String categoria = scanner.nextLine(); //legge stringa per categoria
		
		System.out.print("Inserire il prezzo del prodotto da aggiungere: ");
		double prezzo = scanner.nextDouble(); //legge valore double per prezzo
		Prodotto p = new Prodotto(nome, categoria, prezzo);
		prodotti.add(p); //aggiunge il prodotto alla lista
		
	}
	
	public void filtra(String categoria) {
		for(Prodotto p : prodotti) {
			if(p.getCategoria().equalsIgnoreCase(categoria)) {
				System.out.println(p.toString()); //stampa prodotti
			}
		}
	}
}

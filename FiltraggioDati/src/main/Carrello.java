package main;

import java.util.ArrayList;

public class Carrello {
	//ATTRIBUTI
	private ArrayList <Prodotto> prodottiSelezionati;
	
	//COSTRUTTORE
	public Carrello(ArrayList <Prodotto> prodottiSelezionati) {
		this.prodottiSelezionati = prodottiSelezionati;
	}
	
	//METODI
	public void aggiungiAlCarrello(Prodotto p) {
		prodottiSelezionati.add(p); //aggiunge il prodotto alla lista del carrello
		System.out.println(p.getNome() + " AGGIUNTO AL CARRELLO");
	}
	
	public void prezzoTotCarrello() {
		double prezzoTot = 0.0;
		for(Prodotto p : prodottiSelezionati) {
			prezzoTot += p.getPrezzo(); //somma prezzoTot con il prezzo del prodotto per ogni prodotto nella lista
		}
		System.out.println("Totale del carrello: " + prezzoTot);
	}
	
	public void stampaCarrello() {
		System.out.println("Carrello:");
		for(Prodotto p : prodottiSelezionati) {
			System.out.println(p.toString()); //per ogni prodotto nel carrello stampa tutte le caratteristiche del prodotto
		}
	}
}

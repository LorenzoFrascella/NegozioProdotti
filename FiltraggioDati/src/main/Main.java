package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Crea una classe Prodotto con attributi nome, categoria e prezzo.
		   Crea un ArrayList di prodotti con almeno 5 elementi.
		   Implementa un metodo che filtra e restituisce solo i prodotti appartenenti a una determinata categoria (ad esempio, "Elettronica").
		   Stampa i prodotti filtrati. */
		int qt = 0, qtCarrello = 0;
		String categoria = "";
		Scanner scanner = new Scanner(System.in);
		ArrayList <Prodotto> prodotti = new ArrayList <Prodotto>(); //arraylist per classe negozio
		ArrayList <Prodotto> prodottiCarrello = new ArrayList <Prodotto>(); //arraylist per classe carrello
		
		Negozio n = new Negozio(prodotti);
		Carrello c = new Carrello(prodottiCarrello);
		
		do {
		System.out.println("Quanti prodotti vuoi aggiungere i prodotti?");
		qt = scanner.nextInt();
		
		for(int i = 0; i < qt; i++) {
			n.aggiungi(); //aggiunge prodotti finché i < qt (quantità)
		}
		} while (qt <= 0);
				
		scanner.nextLine(); 
		
		System.out.print("\ninserire una categoria: ");
		categoria = scanner.nextLine(); //legge stringa per categoria
		n.filtra(categoria); //richiama metodo per filtrare la lista
		
		System.out.println("Quanti prodotti vuoi aggiungere al carrello?");
		qtCarrello = scanner.nextInt(); //legge numero intero per quantita prodotti da aggiungere al carrello
		
		scanner.nextLine();
		
		for(int j = 0; j < qtCarrello; j++) {	
			System.out.println("Quale prodotto vuoi aggiungere al carrello?");
			String s = scanner.nextLine(); //legge stringa per leggere nome prodotto da aggiungere al carrello
			
			for(int i = 0; i < prodotti.size(); i++) {
				if(s.equalsIgnoreCase(prodotti.get(i).getNome())){ //trova il prodotto
					c.aggiungiAlCarrello(prodotti.get(i)); //richiama metodo per aggiungere al carrello il prodotto
				}
			}
		}
		scanner.close();
		
		c.stampaCarrello(); //richiama metodo stampaCarrello()
		c.prezzoTotCarrello(); //richiama metodo prezzoTotCarrello()
		
	}
	
	

}

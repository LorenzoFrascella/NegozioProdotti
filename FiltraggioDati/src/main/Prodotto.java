package main;

public class Prodotto {
	//ATTRIBUTI
	private String nome;
	private String categoria;
	private double prezzo;
	
	//COSTRUTTORE
	public Prodotto(String nome, String categoria, double prezzo) {
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}
	//METODI GET E SET
	public Prodotto() {
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	//ALTRI METODI	
	@Override
	public String toString() {
		return "nome: " + nome + " categoria: " + categoria + " prezzo: " + prezzo; //ritorna strina con valori del prodotto
	}
}

package javaGestoreEventi;

import java.time.LocalDateTime;

public class Evento {
	private String titolo;
	private LocalDateTime data;
	private int numeroPostiTotale;
	private static int numeroPostiPrenotati = 0;
	
	Evento(String titolo, LocalDateTime data, int numeroPostiTotale){
		this.titolo = titolo;
		this.data = data;
		this.numeroPostiTotale = numeroPostiTotale;
	}
	
	
	// GETTERS
	public String getTitolo() {
		return titolo;
	}
	public LocalDateTime getData() {
		return data;
	}
	public int getNumeroPostiTotale() {
		return numeroPostiTotale;
	}
	public int getNumeroPostiPrenotati() {
		return numeroPostiPrenotati;
	}
	
	// SETTERS 
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	//AGGIUNGERE VALIDAZIONE DELL'INPUT
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public void setNumeroPostiTotale(int numeroPostiTotale) {
		this.numeroPostiTotale = numeroPostiTotale;
	}
}

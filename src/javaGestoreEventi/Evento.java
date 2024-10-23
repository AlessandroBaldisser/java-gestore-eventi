package javaGestoreEventi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
	private String titolo;
	private LocalDate data;
	private int numeroPostiTotale;
	private static int numeroPostiPrenotati = 0;
	
	Evento(String titolo, LocalDate data, int numeroPostiTotale){
		this.titolo = titolo;
		this.data = data;
		this.numeroPostiTotale = numeroPostiTotale;
	}
	
	
	// GETTERS
	public String getTitolo() {
		return titolo;
	}
	public LocalDate getData() {
		return data;
	}
	public int getNumeroPostiTotale() {
		return numeroPostiTotale;
	}
	public int getNumeroPostiPrenotati() {
		return numeroPostiPrenotati;
	}
	public int getNumeroPostiDisponibili() {
		return numeroPostiTotale-numeroPostiPrenotati;
	}
	
	// SETTERS 
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	//AGGIUNGERE VALIDAZIONE DELL'INPUT
	public void setData(LocalDate data) {
	    // Controlla se la nuova data è nel futuro o uguale ad oggi
	    if (data.isAfter(LocalDate.now()) || data.isEqual(LocalDate.now())) {
	        this.data = data;  // Imposta la data solo se è valida
	    } else {
	    	// Se la data non è valida manda a schermo questa exception
	        throw new IllegalArgumentException("La data non può essere nel passato.");
	    }
	}
	
	public void setNumeroPostiTotale(int numeroPostiTotale) {
		this.numeroPostiTotale = numeroPostiTotale;
	}
	

	public void prenota() {
		if(data.isBefore(LocalDate.now())) { 
			System.out.println("Spiacenti ma l'evento è già passato");
		}else {
			if(numeroPostiTotale - numeroPostiPrenotati == 0) {
				System.out.println("Spiacenti ma non ci sono più posti disposibili");
			}else {
				numeroPostiPrenotati += 1;
			}
		}
	}
	
	public void disdici() {
		if(data.isBefore(LocalDate.now())) { 
			System.out.println("Spiacenti ma l'evento è già passato");
		}else {
			if(numeroPostiPrenotati == 0) {
				System.out.println("Spiacenti ma non ci sono posti prenotati");
			}else {
				numeroPostiPrenotati -= 1;
			}
		}
	}
	@Override
	public String toString() {
		return (data + " - " + titolo);
	}

}






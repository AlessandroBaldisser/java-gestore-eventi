package javaGestoreEventi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
	// Inizializzo gli attributi della classe
	protected String titolo;
	protected LocalDate data;
	private int numeroPostiTotale;
	private static int numeroPostiPrenotati = 0;
	private int numeroPostiDisponibili;
	
	// Costruttore della classe
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
	protected int getNumeroPostiTotale() {
		return numeroPostiTotale;
	}
	protected int getNumeroPostiPrenotati() {
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
		if(this.numeroPostiTotale > 0) {
			this.numeroPostiTotale = numeroPostiTotale;			
		}else {
			throw new IllegalArgumentException("Il numero di posti totali deve essere maggiore di 0!");
		}
	}
	
	// Evento Methods
	
	
	// Due metodi con lo stesso funzionamento, il primo aggiungerà solo un posto ai prenotati,
	// il secondo aggiungerà un numero "i" ai posti prenotati
	
	public void prenota() {
		// Controlla se la data è già passata
		if(data.isBefore(LocalDate.now())) { 
			System.out.println("Spiacenti ma l'evento è già passato");
		}else {
			if(numeroPostiTotale - numeroPostiPrenotati == 0) {
				System.out.println("Spiacenti ma non ci sono più posti disposibili");
			}else {
				// Aggiunge un posto ai prenotati
				numeroPostiPrenotati += 1;
			}
		}
	}
	// Method overloading 
	public void prenota(int i) {
		// Controlla se la data è già passata
		if(data.isBefore(LocalDate.now())) { 
			System.out.println("Spiacenti ma l'evento è già passato");
		}else {
			if(numeroPostiTotale - numeroPostiPrenotati == 0) {
				System.out.println("Spiacenti ma non ci sono più posti disposibili");
			}else if(numeroPostiTotale - (numeroPostiPrenotati +i) <= 0){
				System.out.println("Spiacenti ma non ci sono più posti disposibili");
			}
			else {
				// Aggiunge "i" posti prenotati
				numeroPostiPrenotati += i;
			}
		}
	}
	
	// Due metodi con lo stesso funzionamento, il primo andrà a disdire solo un posto,
	// il secondo andrà a disdire "i" posti 
	
	public void disdici() {
		// Controlla se la data è già passata
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
	
	// Method overloading
	public void disdici(int i) {
		// Controlla se la data è già passata
		if(data.isBefore(LocalDate.now())) {
			System.out.println("Spiacenti ma l'evento è già passato");
		}else {
			if(numeroPostiPrenotati == 0) {
				System.out.println("Spiacenti ma non ci sono posti prenotati");
			}else if(i > numeroPostiPrenotati) {
				// Controlla se il numero dato in input sia maggiore del numero dei posti prenotati
				System.out.println("Spiacenti c'è stato un errore");
			}
			else {
				numeroPostiPrenotati -= i;
			}
		}
	}
	
	@Override
	public String toString() {
		return (data + " - " + titolo);
	}

}


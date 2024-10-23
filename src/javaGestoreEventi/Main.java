package javaGestoreEventi;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Creo lo scanner 
		Scanner scanner = new Scanner(System.in);
		
		// Inizializzo la data dell'evento per inserirla nell'oggetto
		LocalDate dataEvento1 = LocalDate.of(2024, 12, 25);
		Evento evento1 = new Evento("Festa di Natale", dataEvento1, 150);
		
		// Chiedo all'utente quanti posti vuole prenotare 
		System.out.println("Vuole prenotare dei posti? Se si indicarne il numero: ");
		int numeroPostiPrenotati = scanner.nextInt();
		evento1.prenota(numeroPostiPrenotati);
		
		// Stampo numero di posti disponibili e numero di posti prenotati
		System.out.println("Numero di posti disponibili: " + evento1.getNumeroPostiDisponibili());
		System.out.println("Numero di posti prenotati: " + evento1.getNumeroPostiPrenotati());
		
		// Chiedo all'utente quanti posti vuole disdire
		System.out.println("Vuole disdire dei posti? Se si indicarne il numero: ");
		int numeroPostiDisdetti = scanner.nextInt();
		evento1.disdici(numeroPostiDisdetti);
		
		// Stampo numero di posti disponibili e numero di posti prenotati
		System.out.println("Numero di posti disponibili: " + evento1.getNumeroPostiDisponibili());
		System.out.println("Numero di posti prenotati: " + evento1.getNumeroPostiPrenotati());
		
		
		LocalDate dataConcerto1 = LocalDate.of(2024, 11, 13);
		LocalTime oraConcerto1 = LocalTime.of(21, 00);
		Concerto concerto1 = new Concerto("Titolo", dataConcerto1, 150, oraConcerto1, "19.99");
		System.out.println(concerto1.getPrezzo());
	}
}

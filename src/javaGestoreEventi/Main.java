package javaGestoreEventi;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Creo lo scanner 
		Scanner scanner = new Scanner(System.in);
		
//		// Chiediamo all'utente i dati del nuovo evento da creare
//		System.out.println("Prego inserisca i dati del nuovo evento.");
//		System.out.println("Inserisca l'anno dell'evento: ");
//		int annoEvento = scanner.nextInt();
//		System.out.println("Inserisca il mese dell'evento: ");
//		int meseEvento = scanner.nextInt();
//		System.out.println("Inserisca il giorno dell'evento: ");
//		int giornoEvento = scanner.nextInt();
//		System.out.println("Inserisca il titolo dell'evento: ");
//		String titoloEvento = scanner.nextLine();
//		scanner.nextLine();
//		System.out.println("Inserisca i posti totali disponibili per l'evento: ");
//		int postiTotaliEvento = scanner.nextInt();
//		
//		// Inizializzo la data dell'evento per inserirla nell'oggetto
//		LocalDate dataEvento1 = LocalDate.of(annoEvento, meseEvento, giornoEvento);
//		Evento evento1 = new Evento(titoloEvento, dataEvento1, postiTotaliEvento);
//		
//		// Chiedo all'utente quanti posti vuole prenotare 
//		System.out.println("Vuole prenotare dei posti? Se si indicarne il numero: ");
//		int numeroPostiPrenotati = scanner.nextInt();
//		evento1.prenota(numeroPostiPrenotati);
//		
//		// Stampo numero di posti disponibili e numero di posti prenotati
//		System.out.println("Numero di posti disponibili: " + evento1.getNumeroPostiDisponibili());
//		System.out.println("Numero di posti prenotati: " + evento1.getNumeroPostiPrenotati());
//		
//		// Chiedo all'utente quanti posti vuole disdire
//		System.out.println("Vuole disdire dei posti? Se si indicarne il numero: ");
//		int numeroPostiDisdetti = scanner.nextInt();
//		evento1.disdici(numeroPostiDisdetti);
//		
//		// Stampo numero di posti disponibili e numero di posti prenotati
//		System.out.println("Numero di posti disponibili: " + evento1.getNumeroPostiDisponibili());
//		System.out.println("Numero di posti prenotati: " + evento1.getNumeroPostiPrenotati());
		
		
		LocalDate dataConcerto1 = LocalDate.of(2024, 11, 13);
		LocalTime oraConcerto1 = LocalTime.of(21, 00);
		Concerto concerto1 = new Concerto("Titolo", dataConcerto1, 150, oraConcerto1, "19.99");
		System.out.println(concerto1.getPrezzo());
		System.out.println(concerto1.toString());
		
//		List<Evento> programmaEventi1 = new ArrayList<>();
//		LocalDate dataEvento1 = LocalDate.of(2024, 12, 25);
//		LocalDate dataEvento2 = LocalDate.of(2023, 12, 25);
//		LocalDate dataEvento3 = LocalDate.of(2022, 12, 25);
//		Evento evento1 = new Evento("titolo1", dataEvento1, 1650);
//		Evento evento2 = new Evento("titolo2", dataEvento2, 1651);
//		Evento evento3 = new Evento("titolo3", dataEvento3, 1652);
//		programmaEventi1.add(evento1);
//		programmaEventi1.add(evento2);
//		
//		ProgrammaEventi programma1 = new ProgrammaEventi("titolo1", programmaEventi1);
//		programma1.aggiungiEvento(evento3);
//		System.out.println(programma1.getEventi());
//		
//		System.out.println(programma1.eventiInData(dataEvento1));
//		
//		System.out.println(programma1.numeroEventi());
		
//		programma1.svuotaEventi();
//		System.out.println(programma1.numeroEventi());
		
//		programma1.formattaStringa();
	}
}

package javaGestoreEventi;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		
		LocalDate dataEvento = LocalDate.of(2024,10,25);
		LocalDate dataEvento2 = LocalDate.of(2024,10,22);
		Evento evento = new Evento("Titolo", dataEvento, 0);
		
		
		evento.prenota();
		
		System.out.println(evento.getNumeroPostiDisponibili());
		
		System.out.println(evento.toString());
		
		
	}
}

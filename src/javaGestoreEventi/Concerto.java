package javaGestoreEventi;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento{
	private LocalTime ora;
	private String prezzo;
	
	Concerto(String titolo, LocalDate data, int numeroPostiTotale, LocalTime ora, String prezzo) {
		super(titolo, data, numeroPostiTotale);
		// TODO Auto-generated constructor stub
		this.ora = ora;
		this.prezzo = prezzo;
	}
	
	// GETTERS
	public LocalTime getOra() {
		return ora;
	}
	
	public String getPrezzo() {
		String prezzoFormattato = prezzo +"$";
		return prezzoFormattato;
	}
	
	// SETTERS
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	public void setPrezzo(String prezzo) {
		// Controlla se il prezzo è maggiore di 0
		if(!(prezzo.contains("-"))) {
			this.prezzo = prezzo;
		}else {
			// Se il prezzo è minore di 0 stamperà un exception
			throw new IllegalArgumentException("Il prezzo inserito è errato");
		}
	}
	
	@Override
	public String toString() {
		return (data + " - " + ora + " - " + titolo + " - " + getPrezzo());
	}
	
}

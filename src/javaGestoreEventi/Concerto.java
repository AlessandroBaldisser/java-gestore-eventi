package javaGestoreEventi;
import java.time.LocalDate;
import java.text.DecimalFormat;
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
		// Formato con due cifre decimali, il #.00 forza il prezzo ad avere due cifre decimali, in più arrotonda
	    DecimalFormat formattatore = new DecimalFormat("#.00"); 
	    // Converte il prezzo in double con parseDouble
	    double prezzoDouble = Double.parseDouble(prezzo); 
	    // Applica il DecimalFormat e aggiunge il simbolo $	
	    String prezzoFormattato = formattatore.format(prezzoDouble) + "$"; 
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
		return (titolo + ", data: " + data + ", ore: " + ora + ", prezzo: " + getPrezzo());
	}
	
}

package javaGestoreEventi;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class ProgrammaEventi {

	private String titolo;
	private List<Evento> eventi;  //creo un attributo definito da una lista di elementi "Evento" di nome eventi
	
	ProgrammaEventi(String titolo, List<Evento> eventi){
		this.titolo = titolo;
		this.eventi = eventi;
	}
	
	
	public void aggiungiEvento(Evento evento) {
		eventi.add(evento);
	}
	
	public List<Evento> eventiInData(LocalDate giorno){
		List<Evento> risultato = new ArrayList<>();
		eventi.forEach(evento ->{    //il foreach andrà a ciclare ogni elemento nella lista, il "->" serve
			//specificare il codice che dovrà eseguire per ogni elemento nella lista
			if (evento.getData().equals(giorno)) {   //il metodo.equals andrà a confrontare la data dell'evento
				//con la data da noi specificata
				risultato.add(evento);  // se le date coincidono, allora aggiunge quell'elemento alla lista
			}
		});
		return risultato;
	}
	
	
	
	//GETTERS
	public String getTitolo() {
		return titolo;
	}
	public List<Evento> getEventi(){
		return eventi;
	}
	
	//SETTERS
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
}

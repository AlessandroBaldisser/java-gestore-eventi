package javaGestoreEventi;

import java.util.List;

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

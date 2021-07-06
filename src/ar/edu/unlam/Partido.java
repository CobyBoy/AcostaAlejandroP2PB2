package ar.edu.unlam;

import java.util.HashSet;
import java.util.Set;

public class Partido {
	private Integer id;
	private String nombreEquipoLocal;
	private String nombreEquipoVisitante;

private Set<Jugador> jugadores;
	
	public Partido(String nombreEquipoLocal, String nombreEquipoVisitante) {
		this.nombreEquipoLocal = nombreEquipoLocal;
		this.nombreEquipoVisitante = nombreEquipoVisitante;
		this.jugadores = new HashSet<Jugador>();
	}

	protected Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	protected String getNombreEquipoLocal() {
		return nombreEquipoLocal;
	}

	protected void setNombreEquipoLocal(String nombreEquipoLocal) {
		this.nombreEquipoLocal = nombreEquipoLocal;
	}

	protected String getNombreEquipoVisitante() {
		return nombreEquipoVisitante;
	}

	protected void setNombreEquipoVisitante(String nombreEquipoVisitante) {
		this.nombreEquipoVisitante = nombreEquipoVisitante;
	}

	protected Set<Jugador> getJugadores() {
		return jugadores;
	}

	protected void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}

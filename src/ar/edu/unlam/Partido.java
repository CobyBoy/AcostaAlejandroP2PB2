package ar.edu.unlam;

import java.util.HashSet;
import java.util.Set;

public class Partido {
	private Integer id;
	private String nombrePartido;
	private String nombreEquipoLocal;
	private String nombreEquipoVisitante;

private Set<Jugador> jugadores;
	
	public Partido(Integer id,String nombreDePArtido, String nombreEquipoLocal, String nombreEquipoVisitante) {
		this.nombreEquipoLocal = nombreEquipoLocal;
		this.nombreEquipoVisitante = nombreEquipoVisitante;
		this.nombrePartido = nombreDePArtido;
		this.jugadores = new HashSet<Jugador>();
		this.id = id;
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

	@Override
	public String toString() {
		return "Partido [id=" + id + ", nombrePartido=" + nombrePartido + ", nombreEquipoLocal=" + nombreEquipoLocal
				+ ", nombreEquipoVisitante=" + nombreEquipoVisitante + ", jugadores=" + jugadores + "]";
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

	public void agregarJugadoresAPartido(Jugador juga) {
		this.jugadores.add(juga);
		
	}

	protected String getNombrePartido() {
		return nombrePartido;
	}

	protected void setNombrePartido(String nombrePartido) {
		this.nombrePartido = nombrePartido;
	}

}

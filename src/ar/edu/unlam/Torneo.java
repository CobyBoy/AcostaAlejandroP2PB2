package ar.edu.unlam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Torneo {

	private Set <Miembro> miembros;
	private Map <Partido, Partido >partidos;
	
	public Torneo() {
		this.miembros = new TreeSet<Miembro>();
		this.partidos = new HashMap<Partido, Partido>();
		
	}

	protected Set<Miembro> getMiembros() {
		return miembros;
	}

	protected void setMiembros(Set<Miembro> miembros) {
		this.miembros = miembros;
	}

	protected Map<Partido, Partido> getPartidos() {
		return partidos;
	}

	protected void setPartidos(Map<Partido, Partido> partidos) {
		this.partidos = partidos;
	}

	public void registrarMiembrosAlTorneo(Miembro miembroaRegistrarEntorneo) {
		this.miembros.add(miembroaRegistrarEntorneo);
	}

	public Integer getCantidadDeMiembrosEnTorneo() {
		// TODO Auto-generated method stub
		return this.miembros.size();
	}

}

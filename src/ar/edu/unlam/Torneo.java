package ar.edu.unlam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Torneo {

	private Set <Miembro> miembros;
	private Map<String, Partido> partidos;
	
	public Torneo() {
		this.miembros = new TreeSet<Miembro>();
		this.partidos = new HashMap<String, Partido>();
		
	}

	protected Set<Miembro> getMiembros() {
		return miembros;
	}

	protected void setMiembros(Set<Miembro> miembros) {
		this.miembros = miembros;
	}

	protected Map<String, Partido> getPartidos() {
		return partidos;
	}

	protected void setPartidos(Map<String, Partido> partidos) {
		this.partidos = partidos;
	}

	public void registrarMiembrosAlTorneo(Miembro miembroaRegistrarEntorneo) {
		this.miembros.add(miembroaRegistrarEntorneo);
	}

	public Integer getCantidadDeMiembrosEnTorneo() {
		// TODO Auto-generated method stub
		return this.miembros.size();
	}

	@Override
	public String toString() {
		return "Torneo [miembros=" + miembros + ", partidos=" + partidos + "]";
	}

	public void registrarPartido(Partido partido) {
		this.partidos.put(partido.getNombrePartido(), partido);
	}

}

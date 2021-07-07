package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.enums.Posicion;

public class Testing {

	@Test
	public void queSePuedaRegistrarJugadorYDTAlTorneo() {
		Jugador juga = new Jugador(444, 4, Posicion.DEF, "gonzalo MONTIEL", "Argentina");
		Jugador juga2 = new Jugador(445, 5, Posicion.DEF, "Guillermo Maripán", "Chile");
		DirectorTecnico dire = new DirectorTecnico(4, "scalonie", "argentina");
		
		Torneo nuevo = new Torneo();
		nuevo.registrarMiembrosAlTorneo(juga);
		nuevo.registrarMiembrosAlTorneo(juga2);
		nuevo.registrarMiembrosAlTorneo(dire);
		assertEquals((Integer)3, nuevo.getCantidadDeMiembrosEnTorneo());
	}
	
	@Test
	public void queSePuedaRegistrarUnPartido() {
		Jugador juga = new Jugador(444, 4, Posicion.DEF, "gonzalo MONTIEL", "Argentina");
		Jugador juga2 = new Jugador(444, 4, Posicion.DEF, "gonzalo MONTIEL", "Argentina");
		Jugador jugaCh = new Jugador(445, 5, Posicion.DEF, "Guillermo Maripán", "Chile");
		Jugador jugaCh2 = new Jugador(445, 5, Posicion.DEF, "Guillermo Maripán", "Chile");
		DirectorTecnico dire = new DirectorTecnico(4, "scalonie", "argentina");
		
		Torneo nuevo = new Torneo();
		Partido partido = new Partido(1, "janskj","Argentina", "Chile");
		partido.agregarJugadoresAPartido(juga);
		partido.agregarJugadoresAPartido(juga2);
		partido.agregarJugadoresAPartido(jugaCh);
		partido.agregarJugadoresAPartido(jugaCh2);
		
		nuevo.registrarPartido(partido);
		assertEquals(1, nuevo.getPartidos().size());
		
	}

}

package ar.edu.unlam;

import ar.edu.unlam.enums.Posicion;
import ar.edu.unlam.enums.TipoDeMiembro;

public class Jugador extends Miembro {
private Integer numeroDeCamiseta;
	

	public Jugador(Integer dni,Integer numeroDeCamiseta, Posicion posicion, String nombre, String nombreDeEquipo ) {
		super(dni, nombre,nombreDeEquipo);
	}


	@Override
	public String getTipo() {
		return TipoDeMiembro.JUGADOR.getTipo();
	}


	@Override
	public int compareTo(Miembro o) {
		return this.getDni().compareTo(o.getDni());
	}

}

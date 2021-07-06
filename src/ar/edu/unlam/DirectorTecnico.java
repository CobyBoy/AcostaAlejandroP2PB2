package ar.edu.unlam;

import ar.edu.unlam.enums.TipoDeMiembro;

public class DirectorTecnico extends Miembro {

	public DirectorTecnico(Integer dni, String nombre, String nombreDeEquipo) {
		super(dni, nombre, nombreDeEquipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return TipoDeMiembro.DT.getTipo();
	}

	@Override
	public int compareTo(Miembro o) {
		return this.getDni().compareTo(o.getDni());
	}

}

package ar.edu.unlam;

public class Jugador extends Miembro {
private Integer numeroDeCamiseta;
	

	public Jugador(Integer dni,Integer numeroDeCamiseta, Posicion posicion, String nombre, String nombreDeEquipo ) {
		super(dni, nombre,nombreDeEquipo);
	}


	@Override
	public String getTipo() {
		return TipoDeMiembro.JUGADOR.getTipo();
	}

}

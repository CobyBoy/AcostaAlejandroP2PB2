package ar.edu.unlam.enums;

public enum TipoDeMiembro {
	JUGADOR("Jugador"),
	DT("Director Tecnico");
	
	private String tipo;
	TipoDeMiembro(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}

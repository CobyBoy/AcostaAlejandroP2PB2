package ar.edu.unlam;

import ar.edu.unlam.interfaces.Caracterizable;

public abstract class Miembro implements Caracterizable, Comparable<Miembro>{
	private Integer dni;
	private String nombre;
	private String nombreDeEquipo;
	
	public Miembro(Integer dni, String nombre, String nombreDeEquipo) {
	this.dni = dni;
	this.nombre = nombre;
	this.nombreDeEquipo = nombreDeEquipo;
	}

	protected Integer getDni() {
		return dni;
	}

	protected void setDni(Integer dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getNombreDeEquipo() {
		return nombreDeEquipo;
	}

	protected void setNombreDeEquipo(String nombreDeEquipo) {
		this.nombreDeEquipo = nombreDeEquipo;
	}

	@Override
	public String toString() {
		return "Miembro [dni=" + dni + ", nombre=" + nombre + ", nombreDeEquipo=" + nombreDeEquipo + "]";
	}
}

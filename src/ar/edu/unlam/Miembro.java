package ar.edu.unlam;


public abstract class Miembro implements Caracterizable{
	private Integer dni;
	private String nombre;
	private String nombreDeEquipo;
	
	public Miembro(Integer dni, String nombre, String nombreDeEquipo) {
	this.dni = dni;
	this.nombre = nombre;
	this.nombreDeEquipo = nombreDeEquipo;
	}
}

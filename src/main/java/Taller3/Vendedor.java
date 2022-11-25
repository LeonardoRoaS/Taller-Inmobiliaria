package Taller3;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {

	private String titulo;
	private String estadoCivil;

	private List<Inmueble> inmuebles;


	public Vendedor(String nombre, String rut, String direccion, String titulo, String estadoCivil) {
		super(nombre, rut, direccion);
		this.titulo = titulo;
		this.estadoCivil = estadoCivil;
		this.inmuebles = new ArrayList<>();
	}





	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}
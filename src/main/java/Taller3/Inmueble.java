package Taller3;

public class Inmueble {

	private String tipoConstruccion;
	private String ubicacion;
	private int precio;

	public Inmueble(String tipoConstruccion, String ubicacion, int precio) {
		this.tipoConstruccion = tipoConstruccion;
		this.ubicacion = ubicacion;
		this.precio = precio;
	}

	public String getTipoConstruccion() {
		return this.tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString(){
		return this.tipoConstruccion + ", ubicacion: " + this.ubicacion + ", precio: $" + this.precio;
	}

}
package Taller3;

import java.util.ArrayList;
import java.util.List;

public class Venta {

	private List<Cliente> clientes;
	private List<Vendedor> vendedores;
	private List<Inmueble> inmuebles;

	public Venta(){
		this.clientes = new ArrayList<>();
		this.vendedores = new ArrayList<>();
		this.inmuebles = new ArrayList<>();
	}

	public Cliente buscarClientes(String rut){
		for (Cliente cliente : this.clientes){
			if (cliente.getRut().equals(rut)){
				return cliente;
			}
		}
		return null;
	}

	public boolean agregarClientes(String nombre, String rut, String direccion) {
		if (buscarClientes(rut) == null ){
			Cliente cliente = new Cliente(nombre, rut, direccion);
			this.clientes.add(cliente);
			return true;
		}
		return false;
	}

	public Vendedor buscarVendedores(String rut){
		for (Vendedor vendedor : this.vendedores){
			if (vendedor.getRut().equals(rut)){
				return vendedor;
			}
		}
		return null;
	}

	public boolean agregarVendedores(String nombre, String rut, String direccion, String titulo, String estadoCivil) {
		if (buscarVendedores(rut) == null ){
			Vendedor vendedor = new Vendedor(nombre, rut, direccion, titulo, estadoCivil);
			this.vendedores.add(vendedor);
			return true;
		}
		return false;
	}


	public boolean agregarInmueble(String tipoConstruccion, String ubicacion, int precio) {
		Inmueble inmueble = new Inmueble(tipoConstruccion, ubicacion, precio);
		this.inmuebles.add(inmueble);
		return true;
	}

	public void eliminarInmueble(String tipoConstruccion, String ubicacion) {
		for (Inmueble inmueble : this.inmuebles){
			if (inmueble.getTipoConstruccion().equalsIgnoreCase(tipoConstruccion) && inmueble.getUbicacion().equalsIgnoreCase(ubicacion)){
				this.inmuebles.remove(inmueble);
			}
		}
	}

	public void buscarInmueblesPrecio(int precio) {
		for (Inmueble inmueble : this.inmuebles){
			if (inmueble.getPrecio() == precio ){
				System.out.println(inmueble);
			}
		}
	}

	public void buscarInmueblesMaterial(String tipoConstruccion) {
		for (Inmueble inmueble : this.inmuebles){
			if (inmueble.getTipoConstruccion().equalsIgnoreCase(tipoConstruccion)){
				System.out.println(inmueble);
			}
		}
	}

}
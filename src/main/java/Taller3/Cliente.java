package Taller3;

public class Cliente extends Persona {

    public Cliente(String nombre, String rut, String direccion) {
        super(nombre, rut, direccion);
    }

    @Override
    public String toString(){
        return super.nombre + ", " + this.rut + ", " + super.direccion;
    }
}
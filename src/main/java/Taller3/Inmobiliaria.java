package Taller3;

public class Inmobiliaria {

    public static void main(String[] args) {
        Taller3.Inmobiliaria inmobiliaria = new Taller3.Inmobiliaria();
        inmobiliaria.GenerarVenta();
    }

    public void GenerarVenta(){
        Venta venta = new Venta();
        venta.agregarClientes("Leo","211934875","leo@gmail.com");
        venta.agregarVendedores("Samuel","220000001","samuel@gmail.com","Ingeniero","Casado");
        venta.agregarInmueble("Madera","Temuco",12990);
        venta.agregarInmueble("Metal","Los Angeles",15990);
        venta.buscarInmueblesPrecio(12990);
        venta.buscarInmueblesMaterial("Metal");


    }
}

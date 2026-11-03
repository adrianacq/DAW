package ejercicioProducto;

public class Producto {

    private String nombre;
    private double precio;

//constructor solo con nombre: precio por defecto 0.0
public Producto(String nombre) {
    this.nombre = nombre;
    this.precio = 0.0;

}

//constructor con nombre y precio
public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;

}
public String getNombre() {
    return nombre;
}
public double getPrecio() {
    return precio;
}





}

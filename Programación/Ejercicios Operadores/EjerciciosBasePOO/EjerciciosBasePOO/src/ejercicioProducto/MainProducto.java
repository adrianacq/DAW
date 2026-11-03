package ejercicioProducto;

public class MainProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Cuaderno");
        Producto producto2 = new Producto("Mochila", 25.5);

        System.out.println("ejercicioProducto.Producto 1: " + producto1.getNombre() + " " + producto1.getPrecio() + "$");

        System.out.println("ejercicioProducto.Producto 1: " + producto2.getNombre() + " " +  producto2.getPrecio() + "$");
    }
}

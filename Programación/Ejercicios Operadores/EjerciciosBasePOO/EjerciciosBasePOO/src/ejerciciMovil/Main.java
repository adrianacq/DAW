package ejerciciMovil;

public class Main {
    public static void main(String[] args) {
        Movil movil1 = new Movil("Samsung", "Galaxy A15");
        Movil movil2 = new Movil("Xiaomi", "Redmi Note 13", 128);
        Movil movil3 = new Movil("Apple", "iphone 15", 256, true);

        System.out.println("Movil 1:" );
        movil1.mostrarDatos();

        System.out.println("Movil 2: ");
        movil2.mostrarDatos();

        System.out.println("Movil 3: ");
        movil3.mostrarDatos();
    }
}

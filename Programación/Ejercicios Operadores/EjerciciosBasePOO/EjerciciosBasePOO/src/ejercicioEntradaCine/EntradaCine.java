package ejercicioEntradaCine;

public class EntradaCine {

    private String pelicula;
    private int sala;
    private double precio;

    //constructor pelicula
    public EntradaCine(String pelicula){
        this.pelicula = pelicula;
        this.sala = 1;
        this.precio = 7.5;

    }
    //constructor completo
    public EntradaCine(String pelicula, int sala, double precio){
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;

    }

    public String getPelicula(){
        return pelicula;
    }
    public int getSala(){
        return sala;
    }
    public double getPrecio(){
        return precio;
    }

    public void mostrarDatos(){
        System.out.println(pelicula + " - Sala " + sala + " - " + precio + " $ ");

    }

    public static void main(String[] args) {
        EntradaCine entrada1 = new EntradaCine("Toy Story");
        EntradaCine entrada2 = new EntradaCine("Encanto", 3, 8.5);

        System.out.println("Entrada 1: " );
        entrada1.mostrarDatos();

        System.out.println("Entrada 2: ");
        entrada2.mostrarDatos();

        double total = entrada1.getPrecio() + entrada2.getPrecio();
        System.out.println("Total de las entradas: " + total + " $ ");
    }
}

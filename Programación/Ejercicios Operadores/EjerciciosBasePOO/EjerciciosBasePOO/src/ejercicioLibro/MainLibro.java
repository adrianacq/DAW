package ejercicioLibro;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 96);

        System.out.println("ejercicioLibro.Libro 1: " +libro1.getTitulo() + " - " +libro1.getAutor() + " - " +libro1.getPaginas() + " " + "paginas");
        System.out.println("ejercicioLibro.Libro 2: " +libro2.getTitulo() + " - " +libro2.getAutor() + " - " +libro2.getPaginas() + " " + "paginas");

    }
}

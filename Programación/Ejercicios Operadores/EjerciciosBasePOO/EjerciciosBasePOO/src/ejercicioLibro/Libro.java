package ejercicioLibro;

public class Libro {

    //Atributos de clase
    private String titulo;
    private String autor;
    private int paginas;

    //constructor sin parametros: valores por defecto
    public Libro(){
        this.titulo = "Sin titulo";
        this.autor = "Autor desconocido";
        this.paginas = 0;

    }

    //constructor con  los tres datos
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getPaginas(){
        return paginas;
    }
    //setter con validacion (opcional, para que se vea en el sentido de private)
    public void setPaginas(int paginas) {
        if (paginas >= 0){
            this.paginas = paginas;
        }

    }

    }
























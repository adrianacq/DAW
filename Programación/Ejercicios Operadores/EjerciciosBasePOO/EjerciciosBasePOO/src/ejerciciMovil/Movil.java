package ejerciciMovil;

public class Movil {
    private String marca;
    private String modelo;
    private int almacenamientoGB;
    private boolean encendido;

    //constructor marca y modelo
    public Movil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamientoGB = 64;
        this.encendido = false;
    }
    //constructor marca modelo y almacenamiento
    public Movil(String marca, String modelo, int almacenamiento){

        this.marca = marca;
        this.modelo = modelo;
        this.almacenamientoGB = almacenamiento;
        this.encendido = false;
        }
    //construtor con los 4 datos
    public Movil(String marca, String modelo, int almacenamientoGB, boolean encendido){
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamientoGB = almacenamientoGB;
        this.encendido = encendido;

    }
    public void mostrarDatos(){
        System.out.println(marca + " - " + modelo + " - " + almacenamientoGB + " - "
        + " GB - Encendido: " + encendido);

    }
}

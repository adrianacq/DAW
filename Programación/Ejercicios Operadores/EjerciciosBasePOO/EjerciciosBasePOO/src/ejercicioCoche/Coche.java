package ejercicioCoche;

public class Coche {

    private String marca;
    private String modelo;
    private int anio;

    //constructor sin parametros:
    public Coche(){
        this.marca = "Sin Marca";
        this.modelo = "Sin Modelo";
        this.anio = 2000;

    }

    //constructor con marca, modelo y anio 2026
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = 2026;

    }
    //constructor que reciba los 3 datos:
    public Coche(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnio(){
        return anio;
    }
}


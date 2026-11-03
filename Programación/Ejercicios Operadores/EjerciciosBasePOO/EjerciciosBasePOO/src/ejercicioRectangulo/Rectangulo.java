package ejercicioRectangulo;

public class Rectangulo {

    double base;
    double altura;

    //constructor base y altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //constructor para un cuadrado
    public Rectangulo(double lado) {
        this.base = lado;
        this.altura = lado;
    }


}
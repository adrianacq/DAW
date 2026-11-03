package ejercicioRectangulo;

public class MainRectangulo {
        public static void main(String[] args) {
            Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
            Rectangulo cuadrado = new Rectangulo(4.0);

            System.out.println("ejercicioRectangulo.Rectangulo: base " + rectangulo.base + " - altura " + rectangulo.altura);
            System.out.println("Area del rectangulo: " + (rectangulo.base * rectangulo.altura));


            System.out.println("Cuadrado base " + cuadrado.base + " - altura " + cuadrado.altura);
            System.out.println("area del cuadrado: " + (cuadrado.base * cuadrado.altura));
        }

    }
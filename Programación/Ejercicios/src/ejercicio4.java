import java.util.Scanner;

public class ejercicio4 {

    // Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€. El camarero les pregunta cuántas bebidas y bocadillos quieren. Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos. (Bar)
    //ENTRADA/SALIDA
    //Número de bebidas: 3
    //Número de bocadillos: 5
    //Coste de las bebidas: 3.75
    //Coste de los bocadillos: 10.25
    //Coste consumición: 14.0

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        final double PRECIO_BOCATA = 2.05;
        final double PRECIO_BEBIDA = 1.25;
        System.out.println("Cuantas bebidas quieres");;
        System.out.println("Cuantos bocatas quieres");
        int numeroBebidas = lector.nextInt();
        int numeroBocatas = lector.nextInt();
        lector.close();
        double costeBebidas = numeroBebidas * PRECIO_BEBIDA;
        double costeBocatas = numeroBocatas * PRECIO_BOCATA;
        double costeTotal = costeBocatas+costeBebidas;
        System.out.println("el coste de las bebidas es de "+costeBebidas);
        System.out.println("el coste de los bocatas es de "+costeBocatas);
        System.out.println("el coste total es "+costeTotal);







    }
}

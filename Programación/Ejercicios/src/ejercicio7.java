import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("indica el radio de la circunferencia");
        double radio = lector.nextDouble();
        lector.close();
        double longitud = 2*Math.PI*radio;
        double area = Math.PI*Math.pow(radio,2);
        System.out.printf("la longitud del circulo es %.2f\n",longitud);
        System.out.printf("el area del circulo es %.2f\n",area);

    }
}

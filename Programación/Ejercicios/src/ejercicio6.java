import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("indicame el precio de la compra");
        double compra = lector.nextDouble();
        System.out.println("indica que iva se apica a la compra");
        int iva = lector.nextInt(); //12%
        double costeIva = compra * (iva/100.0); //298.45*(12/100)
        double costeSinIva = compra-costeIva;
        System.out.printf("la compra han sido %.2f\n", compra);
        System.out.printf("la compra sin iva han sido %.2f\n", costeIva);
        System.out.printf("el iva ha sido %d\n", iva);

    }
}

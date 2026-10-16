import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("indica el numero a evaluar");
        int numero = lector.nextInt();
        boolean par = numero%2 == 0;
        boolean esMayor = numero>50;
        System.out.println("Es par" +par);
        System.out.println("Es mayor que 50" +esMayor);

        lector.close();
    }
}

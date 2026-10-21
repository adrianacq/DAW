import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("indica una frase");
        String frase1 = lector.nextLine();
        System.out.println("indica una frase");
        String frase2 = lector.nextLine();
        lector.close();
        boolean compararIguales = frase1.equals(frase2);
        boolean compararLongitud = frase1.length() < frase2.length();
        System.out.println("comparar iguales "+compararIguales);
        System.out.println("comparar long "+compararLongitud);
        System.out.println("comparar distintas "+!compararIguales);




    }
}

import java.util.Scanner;

public class ejercicio3operaciones {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce el primer operando");
        int operando1 = lector.nextInt();
        System.out.println("introduce el segundo operando");
        int operando2 = lector.nextInt();
        int suma = operando1+operando2;
        int resta = operando1-operando2;
        int multi = operando1*operando2;
        int divi = operando1/operando2;
        int modulo = operando1%operando2;
        double diviReal = (double) operando1/operando2;
        double moduloReal = (double) operando1%operando2;

        System.out.println("la suma de "+operando1+" y "+operando2+" de los valores es" +suma);;
        System.out.println("la resta de los valores es" +resta);
        System.out.printf("la multi de %d y %d es %d\n",operando1, operando2, multi);
        System.out.println("la divi de "+operando1+" y "+operando2+" de los valores es" + divi);
        System.out.printf("la mod de %d y %d es %d\n",operando1, operando2, modulo);
        System.out.printf("la divi real de %d y %d es %f\n",operando1, operando2, diviReal);
        System.out.printf("la modulo real de %d y %d es %f\n",operando1, operando2, moduloReal);

        lector.close();
    }

}

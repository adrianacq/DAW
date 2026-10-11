import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("indica el numero de grados Cº");
        double gradosC = lector.nextDouble();
        double gradosF = (9 * gradosC)/ 5.0 + 32;
        double gradosK = gradosC + 273.15;
        System.out.printf("vas a pasar %.2f C\n",gradosC);
        System.out.printf("los grados F son %.2f y en K son %.2f\n", gradosF, gradosK);
        System.out.println("indica el numero de grados F");
        gradosF = lector.nextDouble();
        gradosC = (5 * (gradosF-32))/9;
        gradosK = gradosC + 273.15;
        System.out.printf("vas a pasar %.2f F\n",gradosC);
        System.out.printf("los grados C son %.2f y en K son %.2f\n", gradosC, gradosK);
        System.out.println("indica el numero de grados K");
        gradosK = lector.nextDouble();
        gradosF = (9*(gradosK-273.13))/5 +32;
        gradosC = gradosK  -273.13;
        System.out.printf("vas a pasar %.2f K\n",gradosC);
        System.out.printf("los grados C son %.2f y en F son %.2f\n", gradosC, gradosF);



        lector.close();
    }
}

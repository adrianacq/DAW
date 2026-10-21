import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Intreduce el primer numero");
        int num1 = lector.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = lector.nextInt();

        System.out.println("¿" + num1 + " es mayor que " + num2 + "?: " + (num1 > num2));
        System.out.println("¿" + num1 + " es menor que " +num2 + "?: " + (num1 < num2));
        System.out.println("¿" + num1 + " es igual a " + num2 + "?: " + (num1 == num2));
        System.out.println("¿" + num1 + " es diferente a " + num2 + "?: " + (num1 != num2));
        System.out.println("¿" + num1 + " es mayor o igual que " + num2 + "?: " + (num1 >= num2));
        System.out.println("¿" + num1 + " es menor o igual que " + num2 + "?: " + (num1 <= num2));

















        lector.close();

    }
}

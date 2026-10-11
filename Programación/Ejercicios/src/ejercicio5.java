import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        /*
        Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)
         */
        Scanner lector = new Scanner(System.in);
        System.out.println("que cantidad de segundos quieres pasar a h:m:s");
        int segundosSistema = lector.nextInt();
        // 1h = 3600s
        // 1h = 60m
        // 1m = 60s
        lector.close();
        int horas = segundosSistema/3600;
        int segundosRestantes = segundosSistema%3600;//3373
        System.out.println("horas "+horas);
        System.out.println("segundos restantes "+segundosRestantes);
        int minutos = segundosRestantes/60; // 56.21
        System.out.println("minutos "+minutos);
        int segundos = segundosRestantes%60;
        System.out.println("Segundos "+segundos);

    }
}

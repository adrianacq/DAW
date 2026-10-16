import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("indica dmillar");
        int dmillar = lector.nextInt();
        System.out.println("indica umillar");
        int umillar = lector.nextInt();
        System.out.println("indica centenas");
        int centenas = lector.nextInt();
        System.out.println("indica decenas");
        int decenas = lector.nextInt();
        System.out.println("indica unidades");
        int unidades = lector.nextInt();

        System.out.println("Numero Introducido" + dmillar + umillar + centenas + decenas + unidades);
        System.out.println("" +dmillar + umillar + centenas + decenas + unidades);
        System.out.println( dmillar + umillar + centenas + decenas + unidades);
        System.out.println("ahora indica un numero completo");
        int numeroUsuario = lector.nextInt(); //56789
        lector.close();
        System.out.println("Cuantos numeros hay "+String.valueOf(numeroUsuario).length());
        dmillar = numeroUsuario/10000; //5.6789
        umillar = (numeroUsuario/10000)/1000;//6.789
        centenas = ((numeroUsuario/10000)%1000)/100;//7.89
        decenas = (((numeroUsuario/10000)%1000)%100)/10;//8.9
        unidades = ((((numeroUsuario/10000)%1000)%100)%10);//9 //tambien se puede hacer ->
        // unidades = numeroUsuario%10; ya que eso hace que te quedes con el resto que seria el 9 (5678,9)

        System.out.println("El numero es ");
        System.out.println("dmillar "+dmillar);
        System.out.println("umillar "+umillar);
        System.out.println("centenas "+centenas);
        System.out.println("decenas "+decenas);
        System.out.println("unidades "+unidades);




    }
}

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("numero de bocadillos que se piden");
        int nBocadillos = lector.nextInt();
        System.out.println("cuanto te cuesta cada bocadillo");
        double precioBocadillo = lector.nextDouble();
        System.out.println("numero de bebidas que se piden");
        int nBebidas = lector.nextInt();
        System.out.println("cuanto te cuesta cada bebida");
        double precioBebida = lector.nextDouble();
        System.out.println("cuantos sois");
        int alumnos = lector.nextInt();
        lector.close();
        double costeBocadilloTotal = precioBocadillo*nBocadillos;
        double costeBebidasTotal = precioBebida*nBebidas;
        double totalCompra = costeBebidasTotal+costeBocadilloTotal;
        double importeIndividual = totalCompra/alumnos;
        System.out.println("ARTICULO\t\t\t\tCANTIDAD\t\t\t\tCOSTE\t\t\t\t TOTAL\n");
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n"," Bebidas", nBebidas, precioBebida, costeBebidasTotal);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n"," Bocadillos", nBocadillos, precioBocadillo, costeBocadilloTotal);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n"," Compra", nBebidas+nBocadillos, 0.0, costeBebidasTotal+costeBocadilloTotal);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%d\t\t\t\t\t\t%.2f\n"," Coste Por Persona",alumnos, alumnos, importeIndividual);









    }
}

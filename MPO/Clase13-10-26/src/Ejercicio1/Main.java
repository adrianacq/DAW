package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        //1º ¿como crar un obejeto?->
        //-> Nombre de la clase + nombre del objeto = new + nombre del constructor +();
        // (el nombre del constructor es el nombre de la clase)


        Cuenta c1 = new Cuenta("pepe",1.45, "ES263524189", 1000);
        Cuenta c2 = new Cuenta();
        System.out.println(c2.getSaldo());

    }



    }
}

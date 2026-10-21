package model;

public class Jugador {

    //representa el "molde o estructura" de lo que será un jugador real
    // atributos que cualifican -> nombre, nVidas, nHabilidad,
    public String nombre, clan;
    public int vidas, habilidad;
    public boolean estrella;


    /* constructor -> la manera en la que se inicia el jigador (como puedo constriur el jugador) minimo se tiene que
        tener 1 y maximos n
    // el constructor que tenemos por el momento es el vacio
         // mod_acc (modifacor de acceso) -> (public) nombre -> el mismo que el de la clase (jugador) ( param ) { }

    // metodos -> funcionalidades del elemento cuando sea real
        // mod_acc (modifacor de acceso) -> (private/public/protected) retorno (void/int/double) nombre( param ) { }
     */
    public Jugador(String nParametro, String clanParametro, int vidasParametro, int habilidadesPara) {

        System.out.println("Preocedemos a la creacion del jugador");
        nombre = nParametro;
        clan = clanParametro;
        vidas = vidasParametro;
        habilidad = habilidadesPara;
        estrella = false;


    }
}





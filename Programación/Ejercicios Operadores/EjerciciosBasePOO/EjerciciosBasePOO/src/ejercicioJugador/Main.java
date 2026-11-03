package ejercicioJugador;

public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Alex");
        Jugador jugador2 = new Jugador("Dani", 3);
        Jugador jugador3 = new Jugador("Creis", 5, 200);

        System.out.println("Jugador 1: " + jugador1.nombre + " - Nivel " + jugador1.nivel + " - Puntuacion" + " " + jugador1.puntuacion);
        System.out.println("Jugador 2: " + jugador2.nombre + " - Nivel " + jugador2.nivel + " - Puntuacion" + " " + jugador2.puntuacion);
        System.out.println("Jugador 3: " + jugador3.nombre + " - Nivel " + jugador3.nivel + " - Puntuacion" + " " + jugador3.puntuacion);


        //sumar los puntos tras el cambio
        jugador1.puntuacion +=50;
        System.out.println("Puntuaciones después del cambio");
        System.out.println(jugador1.nombre + ":" + jugador1.puntuacion);
        System.out.println(jugador2.nombre + ":" + jugador2.puntuacion);
        System.out.println(jugador3.nombre + ":" + jugador3.puntuacion);



    }
}

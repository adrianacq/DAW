import model.Jugador;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("iniciando programa de juego");

        Jugador jugador1 = new Jugador("Jugador1", "clan1", 10, 0);
        //jugador1.saludar();
        //nombre=null, clan=null, estrella=false , vidas=0 , habilidad=0
        Jugador jugador2 = new Jugador("Manuel", "2", 5, 9);
        //nombre=null, clan=null, estrella=false , vidas=0 , habilidad=0
        Jugador jugador3 = new Jugador("Marta", "clan1", 10, 60);
        //nombre=null, clan=null, estrella=false , vidas=0 , habilidad=0
        Jugador jugador4 = new Jugador("Maria","clan2", 7, 150);
        jugador4.saludar();
        System.out.println("el jugador 4 esta muerto "+jugador4.estaMuerto());;
        jugador4.recibirImpacto();
        jugador4.recibirImpacto();
        jugador4.recibirImpacto();
        jugador4.recibirImpacto();
        jugador4.recibirImpacto();
        jugador4.recibirImpacto();
        jugador4.recibirImpacto();
        jugador4.saludar();
        System.out.println("el jugador 4 esta muerto "+jugador4.estaMuerto());;

        //nombre=null, clan=null, estrella=false , vidas=0 , habilidad=0
        Jugador jugador5 = new Jugador();
        //nombre=null, clan=null, estrella=false , vidas=0 , habilidad=0
        //jugador1.lanzarMensaje("este juego lo voy  a ganar");
        //jugador2.lanzarMensaje("ni de coña, lo gano yo");


        System.out.println("El clan del jugador 3 es " +jugador3.nombre);





    }
}

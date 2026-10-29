package model;

public class Jugador {

    //representa el "molde o estructura" de lo que será un jugador real
    // atributos que cualifican -> nombre, nVidas, nHabilidad,
    public String nombre, clan;
    public int vidas, habilidad;
    public boolean estrella;


    /* constructor -> la manera en la que se inicia el jugador (como puedo constriur el jugador) minimo se tiene que
        tener 1 y maximos n
    // el constructor que tenemos por el momento es el vacio
         // mod_acc (modifacor de acceso) -> (public) nombre -> el mismo que el de la clase (jugador) ( param ) { }
        // si creas mas de 1 constructor -> SOBRECARGA
        // Si no hay constructor escrito, el vacío lo tienes disponible
        //si escribes un constructor diferente al vacío, el vacío se enmascara
            //1 constructor
            //2 constructores

        // metodos -> funcionalidades del elemento cuando sea real
        // mod_acc (modifacor de acceso) -> (private/public/protected) retorno (void/int/double) nombre( param ) { }
     */

    public Jugador() {
    }

    public Jugador(String nombre, String clan,
                   int vidas, int habilidad) {

        System.out.println("Preocedemos a la creacion del jugador");
        this.nombre = nombre;
        this.clan = clan;
        this.vidas = vidas;
        this.habilidad = habilidad;
        estrella = true;

    }

    public Jugador(String nombre, String clan,
                   int vidas) {
        this.nombre = nombre;
        this.clan = clan;
        this.vidas = vidas;
        //this.habilidad;
        this.habilidad = (int) (Math.random() * 101); // lo que hace es cada vez que se ejecute por consola,
        // un valor diferente comprendido entre 0 y 100.999999
    }

    public void saludar() {
        System.out.println("hola mi nombre es " + this.nombre);
        System.out.println("tengo una cantidad de habilidad de " + this.habilidad);
        System.out.println("tengo un % vidas " + this.vidas);

    }

    public void lanzarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public void recibirImpacto(){
        vidas--;
        System.out.printf("mierda, me han dado, me quedan %d vidas\n",vidas);

    }

    public boolean estaMuerto(){
        System.out.println("entro en el hospital, voy a comprobar si estoy muerto");
        boolean muerto = vidas<=0;
        return muerto;

    }
}





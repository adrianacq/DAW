package ejercicioCoche;

public class MainCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Toyota", "Corolla");
        Coche coche3 = new Coche("Seat", "Ibiza", 2026);

        System.out.println("ejercicioCoche.Coche 1: " +coche1.getMarca() + "-" + coche1.getModelo() + "-" + coche1.getAnio());
        System.out.println("ejercicioCoche.Coche 2: " +coche2.getMarca() + "-" + coche2.getModelo() + "-" + coche2.getAnio());
        System.out.println("coche 3: " +coche3.getMarca() + "-" + coche3.getModelo() + "-" + coche3.getAnio());
    }
}

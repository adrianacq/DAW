package main;

public class MainEstudiante {

    public static void main(String[] args) {
    Estudiante e1 = new Estudiante("Alex", "1º DAM");
    Estudiante e2 = new Estudiante("Sara", "1º DAM", true);

        System.out.println("EStudiante 1: " + e1.getNombre() + " - "
                + e1.getCurso() + " - Matriculado: " + e1.isMatriculado());
        System.out.println("Estudiante 2: " + e2.getNombre() + " - " +e2.getCurso() + " - Matriculado: " +e2.isMatriculado());
    }
}

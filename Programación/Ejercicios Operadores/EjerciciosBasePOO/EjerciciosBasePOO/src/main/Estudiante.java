package main;

public class Estudiante {

    private String nombre;
    private String curso;
    private boolean matriculado;

    //constroctor nombre y curso

    public Estudiante(String nombre, String curso){

        this.nombre = "Alex";
        this.curso = "1º DAM";
        this.matriculado = false;

    }

    //constructor con parametros completos:

    public Estudiante(String nombre, String curso, boolean matriculado) {
        this.nombre = nombre;
        this.curso = curso;
        this.matriculado = matriculado;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCurso(){
        return curso;
    }
    public boolean isMatriculado(){
        return matriculado;
    }


}


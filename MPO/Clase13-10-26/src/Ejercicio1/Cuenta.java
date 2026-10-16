package Ejercicio1;

import java.util.Scanner;

public class Cuenta {
    //crear un atributo
    //modificador de acceso (public/private/protected) + tipo + nombre;
    //public: es accesible dentro y fuera de su clase
    //private: es accesible SOLO dentro de su clase
    //Encapsulación: atributos privados + métodos públicos get y set


    /*CONSTRUCTORES-> POR DEFECTO, POR PARAMETROS Y COPIA*/
    //public + nombre de la clase (parametros)

    public Cuenta(String cliente, double interes, String numeroCuenta, double saldo){
        this.cliente = cliente;
        this.interes = interes;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
        public Cuenta(){
            this.saldo = saldo;
        }


          String cliente;
          double interes;
          String numeroCuenta;
          double saldo;

    //GET -> public + tipo + nombre();
    //return valor;
    //}



    public String getCliente() {
        return cliente;
    }

    public double getInteres(){
        return interes;
    }

    public String getNumeroCuenta(){
        return numeroCuenta:
    }

    public double getSaldo (){
        return saldo;
    }

    // Settter -> public + void + nombre(ARRIBUTO OBLIGATORIO){
    //  this.atributo = parametro
    //}

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    // en java se evalua y el programa lo lee de derecha a izquierda.

    public void setInteres(double interes){
        this.interes = interes;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;

    }
    public void setSaldo(double saldo){
        this.saldo = saldo;

    }
    //una variable es un contenedor que guarda el dato
    // un parametro es un tipo especifico de variable que se usa para pasar datos a una función o un metodo
}


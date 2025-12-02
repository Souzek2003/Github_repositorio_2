package org.example;

import java.util.stream.StreamSupport;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        int num = 10;
        int numero = funcion(num, "patri");
        System.out.println(numero);
        procedimento();
        System.out.println("He vuelto del procedimiento");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
    public static int funcion(int numero, String nombre){

        System.out.println("Hola " + nombre);
        numero = numero+20;
        return numero*10;
    }
    public static void procedimento(){

        System.out.println("Hola soy un procedimiento y hago mis cosas sin devolverte nada");
    }
    public static void pintar_nombre(String...nombre){

        for (String nom : nombre){
            System.out.println(nom);
        }
        pintar_nombre("patri","kevin","david");
    }
}

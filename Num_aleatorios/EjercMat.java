package Num_aleatorios;

import java.util.Scanner;


public class EjercMat {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // EjercMat.ejercicio1();
        EjercMat.aleatorios();
        
    }

    

    public static void aleatorios(){
        // double numero = 0;
        for (int i=0; i<5; i++){
            //numeros entre 0 y 6.
            // numero = Math.random()*6 + 1; // entre 1 y 6
            // numero = Math.random()*7; // entre 0 y 6
            // 60 y 90
            // numero = Math.random()*60 + 1; // entre 1 y 60.999999
            // System.out.println((int)numero + 30); // entre 1......60 + 90 
            // System.out.println();
            double nota = Math.random()*10;
            System.out.println("nota = " + Math.round(nota*10.0)/10.0);
        }
    }

    // public static void ejercicio1(){
    //     //metodo trigonométricos --> Math
    //     double valor = Math.sin(90);
    //     // System.out.println(valor);
    //     // System.out.println(Math.toDegrees(valor));
    //     System.out.println(Math.sqrt(4));
    //     System.out.println(Math.pow(3, 2));
    //     System.out.println(Math.abs(-10));
    //     System.out.println(Math.round(10.6));
    //     System.out.println(Math.round(10.4));
    //     System.out.println(Math.round(10.5));
    //     System.out.println(Math.max(23, 25));
    // }
}

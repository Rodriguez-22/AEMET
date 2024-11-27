package Num_aleatorios;

import java.util.Scanner;

public class EjercMat2 {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // EjercMat2.maxminNotas();
        EjercMat2.maxminTemperaturas();
    }

    public static void maxminNotas(){
        double nota = 0;
        double maximo = 0; //supongo que es un 0
        double minimo = 10;
        for (int i=0; i<10; i++){
            nota = Math.random()*10;
            nota = Math.round(nota*100.00)/100.00;
            System.out.println(nota + " - ");
            System.out.println();
            if (nota > maximo) {
                maximo = nota;
            }
            if (nota < minimo) {
                minimo = nota;
            }
        }
        System.out.println("Nota máxima = " + maximo);
        System.out.println("Nota mínima = " + minimo);
    }

    public static void maxminTemperaturas(){
        double temp = 0;
        double maximo = 0; //supongo que es un 0
        double minimo = 10;
        for (int i=0; i<10; i++){
            temp = Math.random()*10;
            temp = Math.round(temp*100.00)/100.00;
            System.out.println(temp + " - ");
            System.out.println();
            if (i == 0) { //en este caso ya no hay incetidumbre en la suposición.
                maximo = temp;
                minimo = temp;
            }else{
                if (temp > maximo) {
                    maximo = temp;
                }
                if (temp < minimo) {
                    minimo = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Temperatura máxima = " + maximo);
        System.out.println("Temperatura mínima = " + minimo);
    }
}

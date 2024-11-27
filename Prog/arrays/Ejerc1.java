package arrays;

import java.util.Scanner;

public class Ejerc1 {
    public static final int NUMERO = 10;
    static int[] numero = new int[NUMERO];
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Ejerc1.numAleatorios();
        Ejerc1.lectura();
        Ejerc1.MaxMin();
    }

    public static int[] numAleatorios(){
        for (int i=0; i<NUMERO; i++){
            int temp = (int)(Math.random()*10);
            numero[i] = temp;
        }
        return numero;
    }

    public static void lectura(){
        for(int i=0; i<NUMERO; i++){
            System.out.println(numero[i]);
        }
    }

    public static void MaxMin(){
        int max = 0;
        int min = 10;
        for (int i=0; i<NUMERO; i++){
            if (numero[i] > max) {
                max = numero[i];
            }
            if (numero[i] < min) {
                min = numero[i];
            }
        }
        System.out.println("El numero máximo es: " + max);
        System.out.println("El numero mínimo es: " + min);
    }
}

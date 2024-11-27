package arrays;

import java.util.Scanner;

public class Ejerc4 {
    public static Scanner entrada = new Scanner(System.in);
    public static final int NUMERO = 10;
    static int[] numero = new int[NUMERO];

    public static void main(String[] args) {
        Ejerc4.GenerarAleatorios();
        Ejerc4.Impresion();
        Ejerc4.MaxMedia();
    }
    
    public static int[] GenerarAleatorios(){
        for (int i=0; i<NUMERO; i++){
            int temp = (int)(Math.random()*10);
            numero[i]= temp;
        }
        return numero;
    }

    public static void Impresion(){
        for (int i=0; i<NUMERO; i++){
            System.out.println(numero[i]);
        }
    }

    public static void MaxMedia(){
        int suma = 0;
        double media;
        for (int i=0; i<NUMERO; i++){
            numero[i]= i+1;
            suma += numero[i];
        }
        // media = (double)suma/numero[i];
        System.out.println("La suma de todo es: " + suma);
    }
}

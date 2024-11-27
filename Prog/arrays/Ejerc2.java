package arrays;

import java.util.Scanner;

public class Ejerc2 {
    public static Scanner entrada = new Scanner(System.in);
    public static int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        Ejerc2.operacion();
    }

    public static void operacion(){
        for (int i=0; i<10; i++){
            System.out.println(numeros[i]);
        }
        int indice = Ejerc2.entrada.nextInt();
        System.out.println(numeros[indice]);
    }
}
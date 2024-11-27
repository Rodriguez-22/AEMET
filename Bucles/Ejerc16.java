package Bucles;

import java.util.Scanner;

public class Ejerc16 {
    public static Scanner entrada = new Scanner(System.in);
        public static void main(String[] args){
            Ejerc16.ejercicio16();
        }

        public static void ejercicio16(){
            System.out.print("Cuantos Primos: ");
            int numero = Ejerc16.entrada.nextInt();
                for (int i=2; i<=numero; i++){
                if (esPrimo(i)) {
                    System.out.println(i+ ", ");
                }
            }
        }

        public static boolean esPrimo(int numero){
            // que todos los restos de dividir ese numero
            //entre los valores de (2... numero-1) es <> 0.
            //verificar que todos los restos son distintos de 0.
            int i = 2;
            boolean primo = true; //vaiable bandera. --> supongo que es primo 
            while ((i < numero) && primo) { // todos los restos.
                //System.out.println(numero + " resto" + i + " = " + numero % i);
                if (numero % i != 0){ //si un resti es distinto de 0 ya asumo que es primo.
                    primo = false;
                }
                i++;
            }
            return primo;
        }
}

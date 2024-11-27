package Bucles;

import java.util.Scanner;

public class Prueba1 {
    public static Scanner entrada = new Scanner(System.in);
        public static void main(String[] args){

            System.out.println("Ejercicios de bucles");
            System.out.println("--------------------");
            // Prueba1.mostrar10();
            // Prueba1.mostrarN();
            System.out.print("Introduce el valor de n: ");
            int n = Prueba1.entrada.nextInt();
            System.out.println("La suma es: " +Prueba1.sumarN(n));
            System.out.println("El factorial es: " +Prueba1.factorialN(n));
        }

        public static void mostrar10() {
            for (int i = 1; i < 11; i++){
                System.out.println("i = " +i);
            }
        }

        public static void mostrarN() {
            //Mostrar los n Primeros números
            System.out.print("Introduce el valor de n: ");
            int n = Prueba1.entrada.nextInt();
            for (int i = 1; i <= n; i++){
                System.out.print(i + " - ");
            }
        }

        public static int sumarN(int n){
            // System.out.print("Introduce el valor de n: ");
            // int n = Prueba1.entrada.nextInt();
            int suma = 0;
            for (int i = 1; i <= n; i++){
                suma = suma + i;
            }
            return suma;
        }

        public static int factorialN(int n){
            System.out.print("Introduce el valor de n: ");
            int factorial = 1;
            for (int i = 1; i <= n; i++){
                factorial = factorial * 1;
            }
            return factorial;
        }
}

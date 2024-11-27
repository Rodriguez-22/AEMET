package Bucles;

import java.util.Scanner;

public class Ejerc15 {
    public static Scanner entrada = new Scanner(System.in);
        public static void main(String[] args){
            Ejerc15.ejercicio15();
        }

        public static void ejercicio15(){
            System.out.print("Base: ");
            int Base = Ejerc15.entrada.nextInt();
            System.out.print("Exponente: ");
            int Exponente = Ejerc15.entrada.nextInt();
                for (int i=1; i<=Exponente; i++){
                    System.out.print(Ejerc15.potencia(Base, i));
                    System.out.print(", ");
                }
        }

        public static long potencia(int Base, int exp){
            long producto = 1;
            for (int i=1; i<=exp; i++){
                producto = Base * producto;
            }
            return producto;
        }
}

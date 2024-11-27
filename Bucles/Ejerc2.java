package Bucles;

import java.util.Scanner;

public class Ejerc2 {
    //me va a pedir el numero 
    public static Scanner entrada = new Scanner(System.in);
        public static void main(String[] args){
            Ejerc2.mostrarMultiplos();
        }
        public static void mostrarMultiplos(){
            System.out.print("El múltiplo");
            int multiplo = Ejerc2.entrada.nextInt();
            int i=0;
            while (i<=100) { //con while siempre hay q declarar la variable.
                if (i % multiplo == 0) 
                System.out.print(i+ ", ");
                i++;
            }
        }
}

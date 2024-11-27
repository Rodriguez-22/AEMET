package Bucles;

import java.util.Scanner;

public class Aleatorios {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Aleatorios.ejercicio2();
        Aleatorios.ejercicio5();
        // Aleatorios.ejercicio6();
        // Aleatorios.ejercicio7();
        // Aleatorios.ejercicio11();

    }

    public static void ejercicio2() {
        int numero = 0;

        numero = (int) (Math.random() * 13) + 1; // entre 1 y 13
        // System.out.print((int)Math.round(numero));
        switch (numero) {

            case 1:
                System.out.println("A");

                break;
            case 11:
                System.out.println("J");

                break;
            case 12:
                System.out.println("Q");

                break;
            case 13:
                System.out.println("K");

                break;

            default:
                break;

        }
        int palos = 0;
        palos = (int) (Math.random() * 4) + 1; // Numeros entre el 1 y el 4

        switch (palos) {
            case 1:
                System.out.println("Picas");

                break;
            case 2:
                System.out.println("Diamantes");

                break;
            case 3:
                System.out.println("Corazones");

                break;
            case 4:
                System.out.println("Trebol");

                break;

            default:
                break;
        }
        System.out.println("Ha salido " + numero + " de " + palos);

    }

    public static void ejercicio5() {
        int maximo = 0;
        int minimo = 0;
        double media = 0;
        int numero = 0;
        for (int i = 0; i < 50; i++) {
            numero = (int)(Math.random()*100) + 100;// numeros del 0 al 99
            if (i == 0) {
                maximo = numero;
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }

            media = media + numero;


            System.out.print( numero+ " "); // numeros del 100 al 199
        }
        System.out.println("El número máximo es " + maximo);
        System.out.println("El número mínimo es " + minimo);
    }

    public static void ejercicio6() {
        double numero = 0;
        numero = Math.random() * 100;// numeros del 1 al 100
        System.out.println((int) numero);
        int i = 1;
        int intentos = 5;
        while (intentos == 5) {
            System.out.print("Añade el numero secreto: ");
            int numerosecreto = Aleatorios.entrada.nextInt();
            if (numero > 75) {
                System.out.println("El numero secreto es mayor");
            } else if (numero < 75) {
                System.out.println("El numero secreto es menor");
            } else if (numero > 50) {
                System.out.println("El numero secreto es mayor");
            } else if (numero < 50) {
                System.out.println("El numero secreto es menor");
            } else if (numero > 25) {
                System.out.println("El numero secreto es mayor");
            } else if (numero < 25) {
                System.out.println("El numero secreto es menor");
            } else if (numero > 1) {
                System.out.println("El numero secreto es mayor");
            } else {
            }
            i++;
        }
    }

    public static void ejercicio7() {

    }

    public static void ejercicio9() {
        int contar = 0;
        int num = 0;
        int i = 0;
        while (num != 24) {
            num = (int)(Math.random()*30)+1;
            if (num % 2 == 0) {
                System.out.print(num + ""); 
            }else{
                // num++;
                // System.out.print(num + ""); 
            }
            contar++;
            i++;
        }
    }

    public static void ejercicio11() {
        int suspensos = 0;
        int aprobados = 0;
        int bien = 0;
        int notables = 0;
        int sobresalientes = 0;
        int mhonor = 0;
        double nota = 0;
        for (int i = 0; i <= 20; i++) {
            nota = Math.random() * 10;
            nota = Math.round(nota * 100.00) / 100.00;
            System.out.print(nota + "");
            if (nota < 5) {
                suspensos++;
            } else if ((nota >= 5) && (nota < 6)) {
                aprobados++;
            } else if ((nota >= 6) && (nota < 7)) {
                bien++;
            } else if ((nota >= 7) && (nota < 9)) {
                notables++;
            } else if ((nota >= 9) && (nota < 10)) {
                sobresalientes++;
            } else {
                mhonor++;
            }
            System.out.println("Suspensos: " + suspensos);
            System.out.println("Bien: " + aprobados);
            System.out.println("Bien: " + bien);
            System.out.println("Notables: " + notables);
            System.out.println("Sobresalientes: " + sobresalientes);
            System.out.println("Mhonor: " + mhonor);
        }
    }

    public static void ejercicio12() {
    }
}
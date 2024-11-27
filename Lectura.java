
import java.util.Scanner;

public class Lectura {
    //lectura es una clase estática.
    public static void main(String[] args) {
        //en la var. cadena almacena la lectura por consola
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce tu ciudad: ");
        String ciudad = sc.nextLine();
        System.out.print("Introduce tu provincia: ");
        String provincia = sc.nextLine();


        System.out.println("Te llamas "+ nombre + apellido + " tienes " + edad + " años y vives en " + ciudad + " y eres de " + provincia);
        //LLamar o invocar al método estatico esMayor()
        Lectura.esMayor(edad);
        Lectura.getAnioNac(edad);
    }

    public static void esMayor (int edad){
        //método estático de la clase Lectura para saber si es o no mayor de edad
        //en programación orientada a objetos, las clases normales vamos a crear objetos utilizando el operador NEW
        //sobre una clase estatica todos sus metodos y propiedades llevan el prefijo static y sobre esta clase no 
        //se pueden crear objetos con el operador NEW
        if (edad >= 18){
            System.out.println("Con la edad de " + edad + " años eres mayor de edad");
        }else {
            System.out.println("Con la edad de " + edad + " años eres menor de edad");
        }
        

    }


    public static void getAnioNac(int edad){
            int anio = 2024 - edad;
            System.out.println("Naciste en el año " +anio);
        }
        
}
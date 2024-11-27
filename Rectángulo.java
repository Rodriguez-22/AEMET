
import java.util.Scanner;

public class Rectángulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);

    }
}

    
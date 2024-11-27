
import java.util.Scanner;
public class CalculoSalario {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas a la semana: ");
        int horastrabajadas = sc.nextInt();
        int salarioHora = 12;
        int salarioSemanal = horastrabajadas * salarioHora;
        System.out.println("El salario semanal es: " + salarioSemanal + " euros");
    }
    
}

//clase principal de un proyecto java, por convenio
public class App {
    int valor = 10;
    //Propiedades --> variables de una clase
    //métodos --> funciones de la clase
    //Una clase contiene propiedades y metodos
    /*
    método o función main() y es el punto de entrada a nuestro
    proyecto. En el metodo main() comienza la ejecución de la
    clase
    */
    public static void main(String[] args) throws Exception {
        //Creación de variables dentro de un método
        int valor = 5;
        double comision = 15.5;
        String nombre = "José"; //clase String de Java --> métodos
        String ciudad = "Almeria"; //tipo básico cadena de caracteres
        String apellidos = "Rodriguez";
        String nombreCompleto;
        nombreCompleto = nombre + "" + apellidos;
        nombre.concat(" ").concat(apellidos);
        System.out.println("Nombre = "+ nombreCompleto.concat(" y eres de ").concat(ciudad));
        System.out.println(("Vives en ").concat(ciudad));

        System.out.printf(("Vives en ").concat(ciudad)+"\n");
        System.out.println(("Vives en ").concat(ciudad));
        System.out.println(nombreCompleto.length());
        // System.out.printf("%20s %10s %10s%n", "Producto", "Cantidad", "Precio");
        // System.out.printf("%20s %10d %10.2f%n","Portatil", 10, 1300.45);
        // System.out.printf("%20s %10d %10.2f%n","Teclado", 19, 64.99);
        // System.out.printf("%20s %10d %10.2f%n","Cascos", 35, 70.50);
        // System.out.printf("%20s %10d %10.2f%n","Nevera", 7, 749.99);
        // System.out.printf("%20s %10d %10.2f%n","Termomix", 9, 499);
        // System.out.printf("%20s %10d %10.2f%n","Iphone 7", 2, 300);
        // System.out.printf("%20s %10d %10.2f%n","Ipad PRO", 25, 1099.99);
        // System.out.printf("%d %f","Ipad 13 pro", 4, 2400);
        // System.out.printf("%s %d %f","Portatil", 40, 1500.3);
        
        // System.out.printf("El valor de la comisión es del %.5f euros%n", comision);
        // System.out.printf("El valor de la comisión es del %10.5f euros%n", comision);
        // System.out.printf("El valor de la comisión es del %-10.5f euros%n", comision);
    }
}

class Futbol{


}
package arrays;
import java.util.Scanner;

public class Temperaturas {
    public static Scanner entrada = new Scanner(System.in);
    static int DIAS = 5;
    static int LUGARES = 4;
    static String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
    static String[] lugares = {"Antas", "Vera", "Garrucha", "Mojacar"};
    static double[][] temperatura = new double[DIAS][LUGARES];//las filas son lugares y columnas son los dias

    public static void main(String[] args) {
        Temperaturas.GenerarTemperatura();
        Temperaturas.ImpresionDatos();
        System.out.println(Temperaturas.getIndexEstacion("Jueves"));
        System.out.println(Temperaturas.getIndexLugares("Mojacar"));
    }

    public static int getIndexEstacion(String dias){
        int index = -1;
        for (int i=0; (i<DIAS) && (index == -1); i++){
            if (Temperaturas.dias[i] == dias) {
                index = i;
            }
        }
        return index;
    }

    public static int getIndexLugares(String lugares){
        int index = -1;
        for (int i=0; (i<LUGARES) && (index == -1); i++){
            if (Temperaturas.lugares[i] == lugares) {
                index = i;
            }
        }
        return index;
    }

    public static double[][] GenerarTemperatura(){
        double temp;//creamos una variable temporal
        for (int i=0; i<DIAS; i++){
            for (int j=0; j<LUGARES; j++){
                temp = Math.random()*30;
                Temperaturas.temperatura[i][j]=Math.round(temp *100.00)/100.00;
            }
        }
        return temperatura;
    }

    public static void ImpresionDatos(){
        System.out.println("---------------------LISTADO TEMPERATURAS---------------------------");
        System.out.printf("%20s", " ");
        for (int i=0; i<DIAS; i++){
            System.out.printf("%10s", dias[i]);
        };
        System.out.println();
        System.out.println();
        for (int j=0; j<LUGARES; j++){
            System.out.printf("%20s", Temperaturas.lugares[j]);
            for (int i=0; i<DIAS; i++){
                System.out.printf("%10.2f", Temperaturas.temperatura[i][j]);
            }
            System.out.println();
            System.out.println();
        }
    }
}

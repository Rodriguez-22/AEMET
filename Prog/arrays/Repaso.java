package arrays;
public class Repaso {
    public static final int NUM = 10;
    static int[] numeros = new int[10];

    public static void main(String[] args) {
        Repaso.generador();
        Repaso.lectura();
    }

    public static int[] generador(){

        
        for(int i=0; i<NUM; i++){
            int temp = (int)(Math.random()*10);
            numeros[i]= temp;
        }
        return numeros;
    }

    public static void lectura(){
        for(int i=0; i<NUM; i++){
         System.out.println(numeros[i]);
        }
    }
    
}
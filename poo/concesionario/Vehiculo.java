package poo.concesionario;

import Arrays.NotasClase;

public class Vehiculo {
    public final int DIAS = 7; //una constante(crear una constante)
    String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    double[] kmSemana = new double[7];
    public String marca;
    public String modelo;
    int velocidad;

    // Constructor
    public Vehiculo(String marca, String modelo, int velocidad){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVelocidad(velocidad);
    }
    //Metodos funcionales --> comportamientos
    public void generarkmSemana() {
        for (int i=0; i<DIAS; i++){
            double temp = Math.random() * 200;
            this.kmSemana[i] = Math.round(temp * 100.00) / 100.00;
        }
    }



    //metodos getters y setters
    //2--> metodos getters y setters (R/W)
    public void setVelocidad(int vel){
        if (vel < 100) { //condiciones
            this.velocidad = 100;
            System.out.println("Error en Velocidad, asignado xDef velocdad mínima");
        }else{
            this.velocidad = vel;
        }
    }

    //responsables de moificar las propiedades de clase.
    public void setMarca(String marca) {
        this.marca = marca.toUpperCase();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.toUpperCase();
    }

    //responsable de leer las propiedades de la clase

    public int velocidad(){
        return this.velocidad;
    }

    public String getMarca(){
        return this.marca.toLowerCase();
    }

    public String getModelo(){
        return this.modelo.toLowerCase();
    }

    //3--> Métodos de Impresión

    public void Info(){
        System.out.println("Vehículo1: " + this.getMarca() + " " + this.getModelo());
    }

    //este es otro modo de hacerlo

    public String toString(){
        String info = "";
        info = " Vehiculo{\n"
                + "Marca: " + this.marca + " \n" 
                + "Modelo: " + this.modelo + " \n"
                + "Velocidad: " + this.velocidad + "km/h \n"
                + "}";
        String kmDias = "";
        for (int i=0; i<DIAS; i++){
            kmDias = kmDias + diasSemana[i] + ": " + kmSemana[i] + "\n";
        }
        return info;
    }
}

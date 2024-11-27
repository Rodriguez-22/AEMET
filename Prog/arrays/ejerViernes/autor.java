package arrays.ejerViernes;

import java.util.Scanner;

public class autor {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private int id;

    public autor(String nombre, String apellido1, String apellido2, String email, int id) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.id = id;
    }

    public String toString() {
        return "Autor: " + nombre + " " + apellido1 + " " + apellido2 + ", Email: " + email + ", ID: " + id;
    }

    public void setNombres(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return this.nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public String getEmail() {
        return this.email;
    }

    public int getId() {
        return this.id;
    }

    // public int IdAleatorio(){
    // int temp;//creamos una variable temporal

    // temp = (int) (Math.random()*30);
    // return temp;
    // }
}

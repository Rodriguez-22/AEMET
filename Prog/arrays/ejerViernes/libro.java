package arrays.ejerViernes;
import java.util.Scanner;

public class libro {
    private String codigo;
    private String titulo;
    private String autor;
    private int año;

    public libro(String codigo, String titulo, String autor, int año){

    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAño(int año){
        this.año = año;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAño(){
        return this.año;
    }
}

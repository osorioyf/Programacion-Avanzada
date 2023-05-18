import java.util.*;

class Persona {
    //atributos
    private String nombre;
    private String apellidos;
    private int edad;

    //constructor
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //funciones
    public String getnombre() { return nombre;}
    public void setnombre(String nombre) { this.nombre = nombre;}
    public String getapellidos() { return apellidos;}
    public void setapellidos(String apellidos) { this.apellidos = apellidos;}
    public int getedad() { return edad;}
    public void setedad(int edad) { this.edad = edad;}
}

class Profesor extends Persona {
    //atributos propios de la subclase 
    private String idprofesor;
    
    //constructor
    public Profesor(String nombre, String apellidos, int edad){
        super(nombre, apellidos, edad);
        idprofesor = "unknown";
    }
    
    //metodos propios de la subclase
    public void setidprofesor(String idprofesor){
        this.idprofesor = idprofesor;
    }
    
    public String getidprofesor(){
        return idprofesor;
    }
        
    public String tostring(){
        return "" + getnombre() + " " + getapellidos() + " - " + getedad() + " - " + getidprofesor(); 
    }
}

public class HerenciaPrincipal {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("profesor", "mendoza cuba", 33);
        profesor1.setidprofesor("profesor123456789");
        System.out.println(profesor1.tostring());
    }
}

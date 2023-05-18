class Vehiculo {
    private int numeroRuedas;
    
    public Vehiculo(int numeroRuedas){
        this.numeroRuedas = numeroRuedas;
    }
    
    public void conducir(){
        System.out.println("Conduciendo...");
    }
}

class Coche extends Vehiculo {
    private String marca;
    
    public Coche(String marca, int numeroRuedas){
        super(numeroRuedas);
        this.marca = marca;
    }
    
    public void abrirPuerta(){
        System.out.println("Abriendo puerta...");
    }
    
    public void activarCuatroPorCuatro(){
        System.out.println("Activando tracción a las cuatro ruedas...");
    }
}

public class Main {
    
    public static void main(String[] args){
        Coche coche = new Coche("Mercedes",4);
        coche.abrirPuerta();
        coche.conducir();
        coche.activarCuatroPorCuatro();
    }
}
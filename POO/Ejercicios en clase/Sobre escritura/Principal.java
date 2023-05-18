/*Fecha: 8 de mayo de 2023
  Autor: Daniel Osorio
  Tema: Sobre escritura de metodos en POO 
 */
 
class Padre{
    //los metodos privados no se sobrescriben
    private void m1(){
        System.out.println("Desde el padre el m1()");
    }
    
    protected void m2(){
        System.out.println("Desde el padre el m2()");
    }
}

class Hija extends Padre{
    //nuevo metodo m1()
    //único a la clase Hija
    private void m1(){
        System.out.println("Desde Hija m1()");
    }
    
    //metodo overriding 
    //con mas accesibilidad
    @Override 
    public void m2(){
        System.out.println("Desde Hija m2()");
    }
}

//Driver class
class Principal{
    public static void main(String[] args){
        Padre obj1 = new Padre();
        obj1.m2();
        Padre obj2 = new Hija();
        obj2.m2();
    }
}
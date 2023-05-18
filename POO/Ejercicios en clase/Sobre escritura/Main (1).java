/*Fecha: 8 de mayo de 2023
  Autor: Daniel Osorio
  Tema: Sobre escritura de metodos en POO 
 */
 
 class Padre{
     //Metodo show
     void show(){
         System.out.println("Clase Padre: metodo SHOW()");
     }
 }
 
 class Hija extends Padre{
     //Este metodo sobre escribe el metodo show de la clase Padre
     void show(){
         System.out.println("Clase Hija: metodo SHOW()");
     }
 }
 
 //Clase Principal
 class Over02{
     public static void main(){
         //Se instancia un objeto del tipo Padre
         Padre objeto1 = new Padre();
         objeto1.show();
         //Se hace una referencia al objeto del tipo Hija
         //Esto se llama RUN TIME POLIFORMISMO
         Padre objeto2 = new Hija();
         objeto2.show();
     }
 }
  
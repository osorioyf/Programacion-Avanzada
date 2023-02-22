/******************************************************************************
Fecha: 15/02/2023
Autor: Daniel Osorio
Taller 02
*******************************************************************************/

#include <iostream>
#include <fstream>
#include <conio.h>
#include <cstdlib>

using namespace std;

//Declaración de variables
    int op, i, j, a, b, cant, y, d, o, cont;

//Estructura para capturar los resultados Max y N
struct resultados{
int max_valor;
int size_array;
int *int_array;
int numeros[];
}resultados1;

//Prototipo funciones
void generarVectorAleatorio();
void generarHistograma();
void menu();


int main(){
	cout<<"***************************TALLER 02***************************"<<endl;
	cout<<endl<<"EJERCICIO 01"<<endl<<endl;
	
	//Se pregunta la cantidad de dias
	cout<<"Ingrese la cantidad de dias: ";
	cin>>cant;
	
	int numeros[cant];
	menu();
}

void generarVectorAleatorio(){
	//Se crea un array con la cantidad de elementos
	int numeros[cant];
	
	//Se generan numeros aleatorios entre 0 y 20
	for(i=0;i<cant;i++){
	    a=rand() % 21;
	    resultados1.numeros[i]=a;
	}
	
	//Se muestra el vector aleatorio
	cout<<endl<<"Vector aleatorio: ";
	for(i=0;i<cant;i++){
		cout<<resultados1.numeros[i]<<" ";
	}

	//Se busca el valor maximo
	resultados1.max_valor = resultados1.numeros[0];
	for(i=0;i<cant;i++){
		if(resultados1.numeros[i]>resultados1.max_valor){
			resultados1.max_valor=resultados1.numeros[i];
		};
	}
	
	cout << "\nMax:" <<resultados1.max_valor<< endl;
    cout << "Size: " <<cant<< endl;
}
	
void menu(){
	
	do{
	
	cout<<endl<<"Menu: "<<endl;
	cout<<"        0) Presentar la generacion del conjunto de numeros aleatorios"<<endl;
	cout<<"        1) Presentar el histograma del conjunto de numeros aleatorios"<<endl;
    cout<<"        2) Salir del programa"<<endl<<endl;
    cout<<"        Por favor ingrese el numero de la opcion que quiere realizar: ";
    cin>>op;
    
    switch(op){
    	
    	case 0: 
    	    generarVectorAleatorio();
    	    cout<<endl<<endl;
    	    o = -1;
    	break;
    	
    	case 1:
    		generarHistograma();
    		cout<<endl<<endl;
    		o = -1;
    	break;
    	
    	case 2: //Para salir del programa
		    o=1;
    	break;
    	
    	default: //Opción de reserva en caso de entrada de datos errónea
            cout <<"Ingrese opción valida"<<endl;
    	break;
	}
   }
   while(o<0); 
}

void generarHistograma(){

	cout<<endl<<"      Index    Valor     Histograma"<<endl;;
	
	   for(y=0;y<cant;y++){	
	       cout<<"  "<<"\t"<<y<<" "<<"\t"<<resultados1.numeros[y]<<"\t";
	    	for(i=0;i<cant;i++){
	    		if(resultados1.numeros[y]==resultados1.numeros[i]){
	    			cout<<"*";
				}
				
			}
			cout<<endl;
	    }
	
	    cout<<endl;
}



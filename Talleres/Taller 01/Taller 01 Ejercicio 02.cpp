/******************************************************************************
Fecha: 10/02/2023
Autor: Daniel Osorio
Taller 01
*******************************************************************************/

#include <iostream>
#include <fstream>
#include <conio.h>
#include <cstdlib>
#include <ctime>

using namespace std;

//Se crea la estructura para capturar datos
struct Datos{
    char nombre[50];
    char genero[20];
    int edad;
    long long cedula;
    long long movil;
}datos, *puntero_datos = &datos;

void pedirDatos();
void imprimirDatos();

int main(){
	
	cout<<"***************************TALLER 01***************************"<<endl;
	cout<<endl<<"EJERCICIO 02"<<endl<<endl;
	
	pedirDatos();
	imprimirDatos();
}

//Se crea una funcion para pedir datos
void pedirDatos(){
	
	// Se preguntan los datos
    cout<<"\n Ingrese nombre: ";
    cin.getline(puntero_datos->nombre,30,'\n');
    cout <<"\n Ingrese genero: ";
    cin.getline(puntero_datos->genero,20,'\n');
    cout <<"\n Ingrese edad: ";
    cin>>(puntero_datos->edad);
    cout <<"\n Ingrese cedula: ";
    cin>>(puntero_datos->cedula);
    cout <<"\n Ingrese movil: ";
    cin>>(puntero_datos->movil);
}

//Se crea una funcion para imprimir datos
void imprimirDatos(){
    
    // Se escribe sobre un fichero; se usa "ofstream" para almacenar en el fichero
    // Se crea el objeto tipo ofstream (digital)junto con el nombre del fichero(fisico)
    ofstream fichero_escritura;
    fichero_escritura.open("datos_usuario.txt");
    // se debe preguntar si hay espacio en memoria para abrir el fichero_escritura
    if (fichero_escritura.is_open()){
    fichero_escritura<<"\nSu nombre: "<<puntero_datos->nombre<<endl;
    fichero_escritura<<"\nSu genero: "<<puntero_datos->genero<<endl;
	fichero_escritura<<"\nSu edad: "<<puntero_datos->edad<<endl;
	fichero_escritura<<"\nSu cedula: "<<puntero_datos->cedula<<endl;
	fichero_escritura<<"\nSu movil: "<<puntero_datos->movil<<endl;
    }
    
    else {
        cout<<"No tiene permisos de escritura" << endl;
    }
    fichero_escritura.close();
	
}

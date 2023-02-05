/******************************************************************************
Fecha: 30/01/2023
Autor: Daniel Osorio
Problema: "Se tiene un Gym que refiere un sistema informatico para capturar
           los datos de sus clientes".
Caracteristicas: Se crea un struct para hacer el tipo de dato al capturar los
                 datos.
                 Se presenta que por cada dato, se imprime la pregunta y se captura.
*******************************************************************************/

#include <iostream>
#include <conio.h>
using namespace std;

// se crea un struct para capturar datos

struct gym_usuario {
    string nombre;
    int edad;
    long long cedula;
    long long movil;
    float masa_corporal;
    char genero[20];
} gym_usuario1;

int main()
{
    // Se da la bienvenida y presentacion
    cout << "\n***********" ;
    cout << "\n*** BIENVENIDO AL GYM ***" ;
    cout << "\n***********" ;
    
    // Se preguntan los datos
    cout <<"\n Ingrese nombre: ";
    cin >> gym_usuario1.nombre;
    cout <<"\n Ingrese edad: ";
    cin >> gym_usuario1.edad;
    cout <<"\n Ingrese cedula: ";
    cin >> gym_usuario1.cedula;
    cout <<"\n Ingrese movil: ";
    cin >> gym_usuario1.movil;
    cout <<"\n Ingrese Masa corporal: ";
    cin >> gym_usuario1.masa_corporal;
    cout <<"\n Ingrese genero: ";
    cin >> gym_usuario1.genero;
   
   // Se imprimen las respuestas
   cout << "\n Sus datos son: ";
   cout << "\n Nombre: ";
   cout << gym_usuario1.nombre;
   cout <<"\n Edad: ";
   cout << gym_usuario1.edad;
   cout <<"\n Cedula: ";
   cout << gym_usuario1.cedula;
   cout <<"\n Movil: ";
   cout << gym_usuario1.movil;
   cout <<"\n Masa corporal: ";
   cout << gym_usuario1.masa_corporal;
   cout <<"\n Genero: ";
   cout << gym_usuario1.genero;
    return 0;
}

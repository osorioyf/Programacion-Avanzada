/******************************************************************************
Fecha: 10/02/2023
Autor: Daniel Osorio
Taller 01
*******************************************************************************/

#include <iostream>
#include <fstream>
#include <conio.h>
#include <cstdlib>

using namespace std;

int num(int a);
int a, i, y, *apuntador;
int *puntero;

int main(){
	
	cout<<"***************************TALLER 01***************************"<<endl;
	cout<<endl<<"EJERCICIO 01"<<endl<<endl;
	
	//Se crea un array con 10 elementos
	int numeros[10];
	
	//Se llena el array con 10 n�meros aleatorios
	for(i=0;i<10;i++)
	numeros[i]=num(a);
	
	// Se crea un puntero
	puntero = numeros;
	
	//Se imprime el contenido del array usando el puntero
	for(y=0;y<10;y++){
	
	cout<<"Numero "<<y+1<<": "<<*puntero<<endl;
	cout<<"Posicion: "<<puntero<<endl;
	puntero++;
}
	
	return 0;
}

//Se crea una funci�n para generar n�meros aleatorios entre 0 y 25
int num(int a){
	
	a=rand() % 26;
	
	return a;
}


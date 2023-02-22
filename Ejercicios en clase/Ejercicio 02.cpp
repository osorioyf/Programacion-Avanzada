/**********
Fecha:8-feb-2023
Autor:Daniel Osorio
Tema: Clase vector (biblioteca de funciones y metodos de la clase vector)
*********/

#include <iostream>
#include <fstream>
#include <ctime>

using namespace std;

int main(){
	//Se declaran los vectores a usar
	vector<int> vector01;
	
	//Se asigna un tamaño y se inicializa en un valor
	vector01.assign(10,384);
	
	//Se imprime primera version del vector
	for(i=0;i<vector01.size();i++)
	cout<< vector01.[i] << " ";
	
	cout << endl;
	
	//Se ingresa el valor 5 al final 
	vector01.push_back(5);
	//Se imprime segunda version del vector
	cout << "\nSegunda version del vector" << endl;





























}

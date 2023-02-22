/*****************************************************************************************************
Autor: Daniel Osorio
Fecha: 13 - 02 - 2023
Tema: Ejercicio tipo parcial
Problema: Se requiere hacer una aplicacion que capture los datos de usuarios segun 
          tipo de cliente, el resultado sera valor a pagar segun la cantidad de canales
          premium a pagar y conexiones de servicios basicos.
          1. - Inicialmente el usuario sdeberá digitar el número de cuenta.
          2. - Existen dos tipos de clientes: r/R (Residencial) y n/N (Negocio)
          3. - El valor si es residencial es igual a 20.7 mas 8.8 veces la (cantidad_canales_premium)
          4. - El valor si es negocios, vendra definido por:
               - Si la cantidad de conexiones servicios_basicos es mayor a 10:
                    * El valor es igual a el restante de los 10 (conexiones_servicios_basicos) mas 
                    78.9 mas 18.7 veces cantidad_canales_premium)
          5. - Al final se pregunta al usuario si quiere ingresar otro cliente o no.
/*****************************************************************************************************/

#include <iostream>
#include <fstream>
#include <ctime>
#include <vector>

using namespace std;

int numcue, can, con, a;
string resp;
float valor;

int main(){
	
	a=1;
	while (a>0){
	
	cout<<"BIENVENIDO"<<endl<<endl;
	cout<<"Ingrese su numero de cuenta por favor: ";
	cin>>numcue;
	cout<<"Si es Residencial marque R, si es Negocio marque N: ";
	cin>>resp;
	cout<<"¿Cuantos canales premium tiene? ";
	cin>>can;
	if (resp =="R"){
		valor=20.7 + (8.8*can);
		cout<<"El valor total es: "<<valor;}
		
	else (resp =="N"){
		cout<<"¿Cuantas conexiones tiene de servicios basicos? ";
		cin>>con;
		if(con>10){
			valor= con - 10 + 78.9 + (18.7*can);
			cout<<"El valor total es: "<<valor;
		}
	}	}
    
    cout<<"Si desea ingresar otro cliente marque 1: ";
    cin>>a;
}
	


#include <iostream>
#include <fstream>
#include <ctime>
#include <vector>

using namespace std;

int main(){
	
	vector<int> vector01 (6,201);
	vector<int> vector02 (4,400);
	vector<int>::iterator it;
	
	int myarray[] = {501, 502, 503, 304, 404};
	
	for (it=vector01.begin();it<vector01.end();it++)
	  cout<<" " << *it;
	  cout<<std::endl;
	  it=vector01.begin();
	  it=vector01.insert (it,200);
	  vector01.insert (it,2,300);
	  for (it=vector01.begin();it<vector01.end();it++){
	  	cout << " " << *it;
	  }
	  
	  
	  cout << endl;
	  // "it" No valido, asignar de nuevo;
	  it = vector01.begin();
	  vector01.insert(it+2,vector02.begin(),vector02.end());
	  vector01.insert(vector01.begin(),myarray,myarray+3);
	  cout << "myvector contanis:";
	  for(it=vector01.begin();it<vector01.end();it++)
	  cout <<" "<< *it;
	  cout << "\n";
}

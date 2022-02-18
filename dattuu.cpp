#include<iostream>
using namespace std;
int n,k;
char a[20];
bool ok;
void in(){
	cin >> n >> k;
	for(int i = 1; i <= k; i++){
		a[i] = char(65 + i-1);
	}	
}
void ket_qua(){
	for(int i = 1; i <=k ;i++){
		cout << a[i];
	} 
	cout << endl;
}
void sinh(){
	int i = k;
	while(i > 0 && a[i] == n-k+i+64) i--;
	if(i > 0){
		a[i] = a[i] + 1;
		for(int j = i+1; j <=k; j++){
			a[j] = a[i] + j - i;
		}
	}
	else ok = false;
}
int main(){
	int t;
	cin >> t;
	while(t--){
		ok = true;
		in();
		while(ok){
			ket_qua();
			sinh();
		}
	}
}

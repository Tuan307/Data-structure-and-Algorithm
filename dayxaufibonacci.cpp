#include<iostream>
#include<string>
using namespace std ;
long long f[100];
string fiboword(int n,long long k){
	if(n == 1) return "A";
	if(n == 2) return "B";
	if(k <= f[n-2]) return fiboword(n-2,k);
	return fiboword(n-1,k-f[n-2]);
}
int main(){
	f[1] = 1;
	f[2] = 1;
	for(int i = 3;i < 94;i++)
		f[i] = f[i-1] + f[i-2];
	int t;
	cin >> t;
	while(t--){
		long long n,k;
		cin >> n >>k;
		cout << fiboword(n,k);
		cout << endl; 
	} 
}

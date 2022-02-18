#include<iostream>
#include<algorithm> 
using namespace std ; 
int main(){
 	int n;
 	cin >> n;
 	int a[n+1],b[n+1],dem = 0;
 	for(int i = 0;i < n;i++){
 		cin >> a[i];
 		b[i] = a[i];
	 }
	 sort(b,b+n);
	 for(int i = 0;i <n;i++){
	 		cout<<b[i]<<" ";
	 	}
	cout << endl;
 return 0;
}

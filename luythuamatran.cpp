#include<bits/stdc++.h>
using namespace std;
const long long mod = 1e9+7;
long long a[10][10], b[10][10];
int n, k;
void luy_thua(long long x[10][10], long long y[10][10]){
	long long result[10][10];
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			long long res = 0;
			for(int c = 0; c < n; c++){
				res += (x[i][c] * y[c][j])%mod;
				res %= mod;
			}
			result[i][j] = res;
//			cout << res << ' ';
		}
	}
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			a[i][j] = result[i][j];
		}
	}
}
void in(long long a[10][10], int k){
	if(k <= 1){
		return;
	}
	in(a, k/2);
	luy_thua(a,a);
	if(k&1) luy_thua(a,b);
}
void solve(){
	cin >> n >> k;
	for(int i = 0; i < n; i++){
		for(int j= 0; j < n; j++){
			cin >> a[i][j];
			b[i][j] = a[i][j];
		}
	}
	in(a,k);
	
	for(int i = 0;i < n; i++){
		for(int j = 0; j < n; j++){
			cout << a[i][j] << ' ';
		}
		cout << endl;
	}
}
int main(){
	int t;
	cin >> t;
	while(t--){
	 	solve();
	}
}

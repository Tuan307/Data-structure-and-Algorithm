#include<bits/stdc++.h>
using namespace std;
long long gcd(long long a,long long b)
{
	if(!a) return b;
	return gcd(b%a,a);
}
long long coprime(long long n,long long m)
{
	long long x,y;
	if((n-m)%2!=0) return false;
	x=(n-m)/2;
	y=m+x;
	if(gcd(x,y)==1) return true;
	else return false;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n,m;
		cin>>n>>m;
		n=(n*(n+1))/2;
		if(coprime(n,m)) cout<<"YES";
		else cout<<"NO";
		cout<<endl;
	}
	return 0;
}


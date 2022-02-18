#include<iostream>

using namespace std;
const long long mod=1e9+7;
long long sqr(long long x)
{
	return x*x;
}
long long pow(long long a,long long b)
{
	if(b==0) return 1%mod;
	else
	{
		if(b%2==0)
		{
			return sqr(pow(a,b/2))%mod;
		}
		else
		{
			return a*(sqr(pow(a,b/2))%mod)%mod;
		}
	}
}
int main()
{
	while(true){
		long long a,b;
		cin>>a>>b;
		if(a==0 && b==0)
		{
			break;
		}
		cout<<pow(a,b)<<endl;
	}
}

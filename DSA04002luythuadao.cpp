#include<bits/stdc++.h>
using namespace std;
long long const mod=1e9+7;
long long mul(long long a)
{
	return a*a;
}
long long dao(long long n)
{
	int t;
	long long sum=0;
	while(n!=0)
	{
		t=n%10;
		sum=sum*10+t;
		n/=10;
	}
	return sum;
}
long long pow(long long n,long long k)
{
	if(k==0) return 1%mod;
    else
	{ 
    if(k%2==0)
    {
    	return mul(pow(n,k/2))%mod;
	}
	else
	{
		return n*(mul(pow(n,k/2))%mod)%mod;
	}
   }
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n,k;
		cin>>n;
		k=dao(n);
		cout<<pow(n,k)%mod;
		cout<<endl;
	}
	return 0;
}


#include<bits/stdc++.h>
using namespace std;
long long bcnn(long long a,long long b)
{
	long long tmp=__gcd(a,b);
	long long bc=(a*b)/tmp;
	return bc;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n;
		cin>>n;
		long long a=1;
		for(int i=2;i<=n;i++)
		{
			a=bcnn(a,i);
		}
		cout<<a<<endl;
	}
	return 0;
}

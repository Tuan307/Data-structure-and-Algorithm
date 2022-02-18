#include<bits/stdc++.h>
using namespace std;
#define mod 1000000007
int a[2001];
int main()
{
	int t;
	cin>>t;
	int i,m,x,j;
	long long sum,n;
	while(t--)
	{
		cin>>m>>x;
		for(j=0;j<m;j++) cin>>a[j];
		m--;
		sum=a[m];
		n=1;
		for(i=m-1;i>-1;i--)
		{
			n=(n*x)%mod;
			sum=(sum+n*a[i])%mod;
		}
		cout<<sum<<endl;
	}
	return 0;
}


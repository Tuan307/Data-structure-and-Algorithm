#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n;
		cin>>n;
		long long d[n+5]={0};
		d[1]=1;
		d[2]=2;
		d[3]=4;
		for(long long i=4;i<=n;i++)
		{
			d[i]=d[i-1]+d[i-2]+d[i-3];
		}
		cout<<d[n]<<endl;
	}
	return 0;
}

#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long a,b;
		cin>>a>>b;
		long long sum;
		long long n[a+1],m[b+1];
		for(long long i=0;i<a;i++)
		{
			cin>>n[i];
		}
		sort(n,n+a);
		for(long long i=0;i<b;i++)
		{
			cin>>m[i];
		}
		sort(m,m+b);
		sum=n[a-1]*m[0];
		cout<<sum<<endl;
	}
	return 0;
}


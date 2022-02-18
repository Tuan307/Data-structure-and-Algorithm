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
		long long a[n+1];
		long long b[n+1],c[n+1];
		long long m=0;
		long long k=0;
		for(long long i=0;i<n;i++)
		{
			cin>>a[i];
			if(a[i]!=0) b[m++]=a[i];
			else c[k++]=a[i];
		}
		for(long long i=0;i<m;i++)
		{
			cout<<b[i]<<" ";
		}
		for(long long i=0;i<k;i++)
		{
			cout<<c[i]<<" ";
		}
        cout<<endl;
	}
	return 0;
}


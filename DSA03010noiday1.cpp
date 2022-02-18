#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n+1];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		sort(a,a+n);
		long long sum=a[0]+a[1];
		long long k=a[0]+a[1];
		for(int i=2;i<n;i++)
		{
		    k+=a[i];
			sum+=k;
		}
		cout<<sum<<endl;
	}
	return 0;
}


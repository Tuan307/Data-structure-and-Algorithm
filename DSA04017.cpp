#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n,d;
		cin>>n;
		long long a[n+1],b[n];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		for(int i=0;i<n-1;i++)
		{
			cin>>b[i];
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=b[i])
			{
				cout<<i+1;
				break;
			}
		}
		cout<<endl;
	}
	return 0;
}




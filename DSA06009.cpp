#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,k;
		cin>>n>>k;
		int a[n+1];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==k)
				{
					count++;
				}
			}
		}
		cout<<count<<endl;
	}
	return 0;
}

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
		int a[n+5][n+5];
		for(int j=1;j<=n;j++)
		{
			cin>>a[1][j];
		}
			for(int i=2;i<=n;i++)
			{
				for(int j=1;j<=n-i+1;j++)
				{
					a[i][j]=a[i-1][j]+a[i-1][j+1];
				}
			}
		for(int i=n;i>=1;i--)
		{
			cout<<'[';
			for(int j=1;j<n-i+1;j++)
			{
				cout<<a[i][j]<<" ";
			}
			cout<<a[i][n-i+1]<<']';
			cout<<" ";
		}
		cout<<endl;
	}
	return 0;
}

